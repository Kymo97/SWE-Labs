package edu.mum.cs.cs425.studentmgmt;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.repository.StudentRepository;

@SpringBootApplication
public class MyStudentMgmtAppApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MyStudentMgmtAppApplication.class, args);
	}	

}
