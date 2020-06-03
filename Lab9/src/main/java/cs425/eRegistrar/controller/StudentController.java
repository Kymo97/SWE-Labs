package cs425.eRegistrar.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cs425.eRegistrar.model.Student;
import cs425.eRegistrar.service.StudentService;

@Controller
@RequestMapping(value = "eregistrar/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping(value = "/list")
	public ModelAndView listStudents() {
		ModelAndView modelAndView = new ModelAndView();
		//System.out.println(studentService.getAllStudents().get());
		modelAndView.addObject("students", studentService.getAllStudents().get());
		modelAndView.setViewName("student/list");
		return modelAndView;
	} 
	
	@GetMapping(value = {"/new"})
	public String displayNewStudentForm(Model model ){
		model.addAttribute("student",new Student());
		return "student/new";	
	}
	
	@PostMapping(value = "/new")
	public String addNewStudent(@Valid @ModelAttribute("student")Student student,Model model,
			BindingResult bindingResult) {
				if(bindingResult.hasErrors()) {
					model.addAttribute("errors", bindingResult.getAllErrors());
					model.addAttribute("student", student);
					return "student/new";
				}
				System.out.println(student);
				studentService.createStudent(student);
				return "redirect:/eregistrar/student/list";	
	}
	
	@GetMapping(value= {"/edit/{id}"})
	public String editStudent(@PathVariable("id") int id,Model model) {
		System.out.println("a7a");
		Student student =studentService.getStudentById(id).get();
		if(student != null) {
			model.addAttribute("student", student);
			return "student/edit";
		}
		return "student/list";	
	}
	
	@PostMapping(value= {"/edit"})
	public String updateStudent(@Valid @ModelAttribute Student student ,Model model) {
		studentService.updateStudent(student);
		return "redirect:/eregistrar/student/list";
	}
	
	
	@GetMapping(value = {"/delete/{id}"})
	public String deleteStudent(@PathVariable("id") long id) {
		studentService.removeStudent(id);
		return "redirect:/eregistrar/student/list";
	}
	
	@GetMapping(value = "/search")
	public String searchStudents(Model model, @RequestParam String searchString) {
		
		model.addAttribute("students", studentService.searchStudents(searchString).get());
		model.addAttribute("searchString", searchString);
		return "student/list";
		
	}
	
	
}
