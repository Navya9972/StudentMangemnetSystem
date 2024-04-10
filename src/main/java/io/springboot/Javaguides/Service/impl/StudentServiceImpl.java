package io.springboot.Javaguides.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import io.springboot.Javaguides.Repository.StudentRepository;
import io.springboot.Javaguides.Service.StudentService;
import io.springboot.Javaguides.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
 
	private StudentRepository studentrepository;
	
	public StudentServiceImpl(StudentRepository studentrepository) {
		super();
		this.studentrepository = studentrepository;
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentrepository.findAll();
	}
	
}
