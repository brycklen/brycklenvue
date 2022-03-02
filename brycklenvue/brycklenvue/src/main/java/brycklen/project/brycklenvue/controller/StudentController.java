package brycklen.project.brycklenvue.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import brycklen.project.brycklenvue.entity.Student;
import brycklen.project.brycklenvue.service.StudentService;

@Controller
public class StudentController {
	
	private StudentService studentService;
	
	// Initialize service
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	// Login page (not yet implemented)
	@GetMapping("/")
	public String loginForm() {
		return "index";
	}
	
	// Home page for the roster
	@GetMapping("/roster")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "student-roster";
	}
	
	@GetMapping("/roster/new")
	public String createStudentForm(Model model) {
		// New student added
		Student student = new Student();
		model.addAttribute("student", student);
		return "student-add";
	}
	
	
	@GetMapping("/roster/update/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "student-update";
	}
	
	// Deletion Confirmation
	@GetMapping("/roster/confirmdelete/{id}")
	public String confirmDeleteStudent(@ModelAttribute("student") Student student) {
		return "student-confirm-delete";
	}
	
	// Delete student from roster
	@GetMapping("/roster/delete/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/roster";
	}
	
	@PostMapping("/roster")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/roster";
	}
	
	@PostMapping("/roster/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {
		
		// Retrieving the student from the database
		Student currentStudent = studentService.getStudentById(id);
		
		// Set updated characteristics for students to the database
		currentStudent.setID(id);
		currentStudent.setFirstName(student.getFirstName());
		currentStudent.setLastName(student.getLastName());
		
		// Student with corresponding ID is saved to the database
		studentService.updateStudent(currentStudent);
		return "redirect:/roster";		
	}
}
