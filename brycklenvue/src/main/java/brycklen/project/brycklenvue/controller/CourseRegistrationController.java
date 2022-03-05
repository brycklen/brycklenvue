/*
package brycklen.project.brycklenvue.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import brycklen.project.brycklenvue.entity.Course;
import brycklen.project.brycklenvue.service.CourseService;
import brycklen.project.brycklenvue.entity.Student;
import brycklen.project.brycklenvue.service.StudentService;

@Controller
public class CourseRegistrationController {
	
	private CourseRegistrationService courseRegistrationService;
	
	// Initialize service
	public CourseRegistrationController(CourseRegistrationService courseRegistrationService) {
		super();
		this.courseRegistrationService = courseRegistrationService;
	}
	
	// Home page for the course reg list
	@GetMapping("/coursereg")
	public String listCourses(Model model) {
		model.addAttribute("COURSES", courseService.getCourses());
		return "course-list";
	}
	
	// Delete student from course reg list
	@GetMapping("/coursereg/delete/{id}")
	public String deleteCourse(@PathVariable Long id) {
		courseService.removeCourse(id);
		return "redirect:/courses";
	}
	
	// Deletion confirmation
	@GetMapping("/coursereg/confirmdelete/{id}")
	public String confirmDeleteCourse(@ModelAttribute("course") Course course) {
		return "course-confirm-delete";
	}
	
	// Course Reg Roster
	@PostMapping("/coursereg")
	public String saveCourseRegistration(@ModelAttribute("course") Course course) {
		courseService.addCourse(course);
		return "redirect:/courses";
	}
	
	@GetMapping("/coursereg/new")
	public String createCourseRegistrationForm(Model model) {
		// New course added
		CourseRegistration courseRegistration = new CourseRegistration();
		model.addAttribute("course", course);
		return "course-add";
	}
	
	@GetMapping("/coursereg/update/{id}")
	public String editCourseRegistrationForm(@PathVariable Long id, Model model) {
		model.addAttribute("course", courseService.getCourse(id));
		return "course-update";
	}

	@PostMapping("/coursereg/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("course") Course course,
			Model model) {
		
		// Retrieving the course rosters from the database
		Course currentCourse = courseService.getCourse(id);
		
		// Set updated characteristics for course rosters to the database
		currentCourse.setId(id);
		currentCourse.setCourseName(course.getCourseName());
		
		// Course roster with corresponding ID is saved to the database
		courseService.updateCourse(currentCourse);
		return "redirect:/coursereg";		
	}
}
*/