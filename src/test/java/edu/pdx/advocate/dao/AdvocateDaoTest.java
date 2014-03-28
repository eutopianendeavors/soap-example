package edu.pdx.advocate.dao;

import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.pdx.advocate.dao.AdvocateDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/cxf-servlet.xml", "/cxf-servlet-test.xml" })
public class AdvocateDaoTest {

	@Autowired
	private ApplicationContext applicationContext;

	// @Test
	// public void testAdvocateDaoStuInfo() throws SQLException {
	// AdvocateDao dao = applicationContext.getBean(AdvocateDao.class);
	// StuInfo stuInfo = dao.getStudentInfo("924889916");
	// System.out.println(stuInfo.getSQLTypeName() + " "
	// + stuInfo.getFullname());
	// }

	@Test
	public void testAdvocateDaoCourseList() throws SQLException,
			ClassNotFoundException {
//		 AdvocateDao dao = applicationContext.getBean(AdvocateDao.class);
//		
//		 System.out.println(dao.getCourses("980631475"));
	}
}
