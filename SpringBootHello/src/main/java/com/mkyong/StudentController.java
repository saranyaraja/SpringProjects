package com.mkyong;
import java.net.URI;
import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/Student/getstudents")
	public List<StudentEntity> retrieveListForStudent() {
		return studentService.getAllStudents();
	}
	
	@PostMapping("/Student/student/{id}/name/{name}/course/{course}")
	public ResponseEntity addStudent(@PathVariable String id,@PathVariable String name,@PathVariable String course ) {
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();
		if(studentService.addStudent(id,name,course)) {
			System.out.println("Successfully added");
			return ResponseEntity.created(location).build();
		} else {
			return ResponseEntity.noContent().build();
		}
	}
	
	@PostMapping("/Student/student/add")
	public ResponseEntity addStudent(@RequestBody StudentEntity student ) {
		if(student==null) {
			 return ResponseEntity.noContent().build();
		}
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{student}").buildAndExpand(student.getId()).toUri();
		if(studentService.addStudent(student)) {
			System.out.println("Successfully added");
			return ResponseEntity.created(location).build();
		} else {
			return ResponseEntity.noContent().build();
		}
	}
	
	
	

}