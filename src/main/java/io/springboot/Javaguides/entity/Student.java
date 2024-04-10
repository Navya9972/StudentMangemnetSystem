package io.springboot.Javaguides.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="students")
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private  long id;
private String FirstName;
private String LastName;
private String Email;

// create a empty default constructor 
public Student()
{
	  
}

//create a parameterized constructor 
public Student(long id, String firstName, String lastName, String email) {
	super();
	this.id = id;
	FirstName = firstName;
	LastName = lastName;
	Email = email;
}


//Generate getter and setter methods
public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getFirstName() {
	return FirstName;
}

public void setFirstName(String firstName) {
	FirstName = firstName;
}

public String getLastName() {
	return LastName;
}

public void setLastName(String lastName) {
	LastName = lastName;
}

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}
}
