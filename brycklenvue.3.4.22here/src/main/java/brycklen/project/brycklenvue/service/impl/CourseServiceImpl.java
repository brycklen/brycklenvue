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
	public Course addCourse(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public Course getCourse(Long id) {
		return courseRepository.findById(id).get();
	}

	@Override
	public Course updateCourse(Course course) {
		return courseRepository.save(course);
	}
	
	@Override
	public List<Course> getCourses() {
		return courseRepository.findAll();
	}
	
	@Override
	public void removeCourse(Long id) {
		courseRepository.deleteById(id);	
	}
}