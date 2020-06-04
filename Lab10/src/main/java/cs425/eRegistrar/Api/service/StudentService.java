package cs425.eRegistrar.Api.service;

import java.util.List;
import java.util.Optional;

import cs425.eRegistrar.Api.model.Student;




public interface StudentService {
	
	public Optional<List<Student>> getAllStudents();
	
	public Optional<Student> createStudent(Student student);
	
	public void removeStudent(long id);
	
	public Optional<Student> getStudentById(long id);
	
	public Optional<List<Student>> searchStudents(String searchWord);
	
	public void updateStudent(Student student);

}
