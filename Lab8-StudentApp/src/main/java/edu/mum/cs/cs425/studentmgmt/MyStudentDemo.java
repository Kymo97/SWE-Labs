package edu.mum.cs.cs425.studentmgmt;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.mum.cs.cs425.studentmgmt.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.repository.ClassRoomRepo;
import edu.mum.cs.cs425.studentmgmt.repository.StudentRepository;

@Component
public class MyStudentDemo implements CommandLineRunner{

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private ClassRoomRepo classRoomRepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Classroom classroom = new Classroom("McLaughlin ", "M105");
		classRoomRepo.save(classroom);
		Transcript transcript = new Transcript("BS Computer Science");
		Student stu = new Student("000-61-0001", "Anna", "Lynn", "Smith", 3.45,transcript, LocalDate.of(2019, 5, 24));
		stu.setClassroom(classroom);
		saveStudent(stu);
	}
	public void saveStudent(Student student) {
		studentRepository.save(student);
	}
}
