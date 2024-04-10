package io.springboot.Javaguides.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.springboot.Javaguides.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{
    
}
