package brycklen.project.brycklenvue.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import brycklen.project.brycklenvue.entity.Course;
import brycklen.project.brycklenvue.service.CourseService;

@Controller
public class CourseController {
	
	private CourseService courseService;
	
	// Initialize service
	public CourseController(CourseService courseService) {
		super();
		this.courseService = courseService;
	}
	
	// Home page for the course list
	@GetMapping("/courses")
	public String listStudents(Model model) {
		model.addAttribute("COURSES", courseService.getAllCourses());
		return "course-list";
	}
	
	// Delete student from course list
	@GetMapping("/courses/delete/{id}")
	public String deleteCourse(@PathVariable Long id) {
		courseService.deleteCourseById(id);
		return "redirect:/courses";
	}
		
	// Deletion confirmation
	@GetMapping("/courses/confirmdelete/{id}")
	public String confirmDeleteCourse(@ModelAttribute("course") Course course) {
		return "course-confirm-delete";
	}
	
	@PostMapping("/courses")
	public String saveCourse(@ModelAttribute("course") Course course) {
		courseService.saveCourse(course);
		return "redirect:/courses";
	}
	
	@GetMapping("/courses/new")
	public String createCourseForm(Model model) {
		// New course added
		Course course = new Course();
		model.addAttribute("course", course);
		return "course-add";
	}
	
	@GetMapping("/courses/update/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("course", courseService.getCourseById(id));
		return "course-update";
	}

	@PostMapping("/courses/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("course") Course course,
			Model model) {
		
		// Retrieving the course from the database
		Course currentCourse = courseService.getCourseById(id);
		
		// Set updated characteristics for courses to the database
		currentCourse.setCourseName(course.getCourseName());
		
		// Course with corresponding ID is saved to the database
		courseService.updateCourse(currentCourse);
		return "redirect:/courses";		
	}
}