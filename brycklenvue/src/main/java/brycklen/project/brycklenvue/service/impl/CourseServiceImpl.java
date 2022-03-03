package brycklen.project.brycklenvue.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import brycklen.project.brycklenvue.entity.Course;
import brycklen.project.brycklenvue.repository.CourseRepository;
import brycklen.project.brycklenvue.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

	private CourseRepository courseRepository;
	
	public CourseServiceImpl(CourseRepository courseRepository) {
		super();
		this.courseRepository = courseRepository;
	}

	@Override
	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}

	@Override
	public Course saveCourse(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public Course getCourseById(Long id) {
		return courseRepository.findById(id).get();
	}

	@Override
	public Course updateCourse(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public void deleteCourseById(Long id) {
		courseRepository.deleteById(id);	
	}
}