package com.mkyong;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Component
public class StudentService {
	private static List<StudentEntity> students = new ArrayList<>();
	static {
		StudentEntity stu1 = new StudentEntity(1, "Saranya", "Java");
		StudentEntity stu2 = new StudentEntity(1, "Prasanth", "Teacher");
		students.add(stu1);
		students.add(stu2);
		
	}
	public List<StudentEntity> getAllStudents() {
		return students;
	}
	public boolean addStudent( String id, String name, String course) {
		students.add(new StudentEntity(Integer.parseInt(id),name,course));
		return true;
	}
	public boolean addStudent( StudentEntity student) {
		students.add(student);
		return true;
	}
	
}
