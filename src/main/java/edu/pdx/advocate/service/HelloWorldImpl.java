package edu.pdx.advocate.service;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import edu.pdx.advocate.dao.AdvocateDao;
import edu.pdx.advocate.model.Course;
import edu.pdx.advocate.model.StuInfo;

@WebService(endpointInterface = "edu.pdx.advocate.service.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Autowired
	private AdvocateDao dao;

	public String sayHi(String text) {
		System.out.println("sayHi called");
		return "Hello " + text;
	}

	public StuInfo getStuInfo(String stuId) {
		return dao.getStudentInfo(stuId);
	}

	public List<Course> getCourses(String stuId) {
		return dao.getCourses(stuId);
	}

	public AdvocateDao getDao() {
		return dao;
	}

	public void setDao(AdvocateDao dao) {
		this.dao = dao;
	}

}
