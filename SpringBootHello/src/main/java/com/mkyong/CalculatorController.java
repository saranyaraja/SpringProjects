package com.mkyong;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	@GetMapping("/Calculator/{number1}/add/{number2}")
	public int retrieveCoursesForStudent(@PathVariable String number1, @PathVariable String number2) {
		return Integer.parseInt(number1)+Integer.parseInt(number2);
	}
	
	@GetMapping("/Calculator/{number1}/sub/{number2}")
	public int subtractOps(@PathVariable String number1, @PathVariable String number2) {
		return Integer.parseInt(number1)-Integer.parseInt(number2);
	}
	
	@GetMapping("/Calculator/add")
	public int retrieveCoursesForStudentQuery(@RequestParam(required = false, value ="number1") String number1, 
			@RequestParam("number2") String number2) {
		return Integer.parseInt(number1)+Integer.parseInt(number2);
	}
	
	

}