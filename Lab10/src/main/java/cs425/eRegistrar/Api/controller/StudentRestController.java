package cs425.eRegistrar.Api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cs425.eRegistrar.Api.model.Student;
import cs425.eRegistrar.Api.service.StudentService;

@RestController
@RequestMapping("/eregistrar/api/student")
public class StudentRestController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping(value = "list")
	public List<Student> listStudents(){
		return studentService.getAllStudents().get();
	}
	
	@PostMapping(value="register")
	public Student addNewStudent(@RequestBody @Valid Student student) {
		return studentService.createStudent(student).get();
	}
	
	@GetMapping(value="get/{id}")
	public Student getStudent(@PathVariable long id) {
		return studentService.getStudentById(id).get();
	}
		
	@DeleteMapping(value = "delete/{id}")
	public void deleteStudent(@PathVariable long id) {
		studentService.removeStudent(id);
	}
	

}
