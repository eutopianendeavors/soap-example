package edu.pdx.advocate.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;
import javax.sql.rowset.serial.SQLInputImpl;

import oracle.jdbc.OracleTypes;
import oracle.sql.STRUCT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.support.oracle.SqlReturnSqlData;
import org.springframework.data.jdbc.support.oracle.SqlReturnStructArray;
import org.springframework.data.jdbc.support.oracle.StructMapper;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import edu.pdx.advocate.model.Course;
import edu.pdx.advocate.model.StuInfo;

public class AdvocateDao {
	@Autowired
	private DataSource dataSource;

	public StuInfo getStudentInfo(String stuId) {
		SimpleJdbcCall call = new SimpleJdbcCall(dataSource)
				.withProcedureName("GetStudentInfo")
				.withCatalogName("ZGADVOCATE")
				.declareParameters(
						new SqlParameter("stuID", OracleTypes.VARCHAR))
				.declareParameters(
						new SqlOutParameter("stuInfo", OracleTypes.STRUCT,
								"ZGADVOCATE_STUINFO_T",
								new SqlReturnSqlData(StuInfo.class)));

		Map<String, String> in = Collections.singletonMap("stuID", stuId);
		return call.executeFunction(StuInfo.class, in);

	}

	public List<Course> getCourses(String stuId) {
		SimpleJdbcCall call = new SimpleJdbcCall(dataSource)
				.withProcedureName("GetClassSchedule")
				.withCatalogName("ZGADVOCATE")
				.declareParameters(new SqlParameter("stuID", Types.VARCHAR))
				.declareParameters(
						new SqlOutParameter("classSched", Types.ARRAY,
								"ZGADVOCATE_SCHED_T",
								new SqlReturnStructArray<Course>(
										new StructMapper<Course>() {

											@Override
											public Course fromStruct(STRUCT arg0)
													throws SQLException {
												Course course = new Course();
												SQLInput input = new SQLInputImpl(
														arg0.getAttributes(),
														new HashMap());
												course.readSQL(input,
														"ZGADVOCATE_CLASS_T");
												return course;
											}

											@Override
											public STRUCT toStruct(Course arg0,
													Connection arg1, String arg2)
													throws SQLException {
												// Not used in this case.
												return null;
											}
										})));

		Map<String, String> in = Collections.singletonMap("stuID", stuId);
		Object[] courseArray = call.executeFunction(Course[].class, in);
		List<Course> courses = new ArrayList<Course>();
		for (Object object : courseArray) {
			courses.add((Course) object);
		}

		return courses;

	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
}
