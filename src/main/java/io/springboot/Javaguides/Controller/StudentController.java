package io.springboot.Javaguides.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import io.springboot.Javaguides.Service.StudentService;

@Controller
public class StudentController {
 
	private StudentService studentservice;
	
	public StudentController(StudentService studentservice) {
		super();
		this.studentservice = studentservice;
	}

	//handle method to handle list of student and return mode mode and view 
	@GetMapping("/students")
	public String listStudents(Model model) {
		 model.addAttribute("students", studentservice.getAllStudents());
		return "students";
	}
}
