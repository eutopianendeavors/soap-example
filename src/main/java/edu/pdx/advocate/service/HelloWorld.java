package edu.pdx.advocate.service;

import java.util.List;

import javax.jws.WebService;

import edu.pdx.advocate.model.Course;
import edu.pdx.advocate.model.StuInfo;

@WebService
public interface HelloWorld {
	String sayHi(String text);

	StuInfo getStuInfo(String stuId);
	
	List<Course> getCourses(String stuId);
}
