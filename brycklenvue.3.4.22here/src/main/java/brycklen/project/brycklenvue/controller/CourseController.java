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
	public String listCourses(Model model) {
		model.addAttribute("COURSES", courseService.getCourses());
		return "course-list";
	}
	
	// Delete course from course list
	@GetMapping("/courses/delete/{id}")
	public String deleteCourse(@PathVariable Long id) {
		courseService.removeCourse(id);
		return "redirect:/courses";
	}
	
	// Deletion confirmation
	@GetMapping("/courses/confirmdelete/{id}")
	public String confirmDeleteCourse(@ModelAttribute("course") Course course) {
		return "course-confirm-delete";
	}
	
	// Course Roster
	@PostMapping("/courses")
	public String saveCourse(@ModelAttribute("course") Course course) {
		courseService.addCourse(course);
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
	public String editCourseForm(@PathVariable Long id, Model model) {
		model.addAttribute("course", courseService.getCourse(id));
		return "course-update";
	}

	@PostMapping("/courses/{id}")
	public String updateCourse(@PathVariable Long id,
			@ModelAttribute("course") Course course,
			Model model) {
		
		// Retrieving the course from the database
		Course currentCourse = courseService.getCourse(id);
		
		// Set updated characteristics for course to the database
		currentCourse.setId(id);
		currentCourse.setCourseName(course.getCourseName());
		
		// Course with corresponding ID is saved to the database
		courseService.updateCourse(currentCourse);
		return "redirect:/courses";		
	}
}