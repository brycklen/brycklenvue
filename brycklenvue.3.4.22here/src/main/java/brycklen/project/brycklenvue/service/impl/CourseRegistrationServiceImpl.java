/*
package brycklen.project.brycklenvue.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import brycklen.project.brycklenvue.entity.Course;
import brycklen.project.brycklenvue.entity.Student;
import brycklen.project.brycklenvue.repository.CourseRegistrationRepository;
import brycklen.project.brycklenvue.service.CourseRegistrationService;

@Service
public class CourseRegistrationServiceImpl implements CourseRegistrationService{

	private CourseRegistrationRepository courseRegistrationRepository;
	
	public CourseRegistrationServiceImpl(CourseRegistrationRepository courseRegistrationRepository) {
		super();
		this.courseRegistrationRepository = courseRegistrationRepository;
	}

	@Override
	public Course assignCourse(Course course, Student student) {
		return courseRegistrationRepository.save(course, student);
	}

	@Override
	public Course getCourse(Long id) {
		return courseRegistrationRepository.findById(id).get();
	}

	@Override
	public Course updateCourse(Course course, Student student) {
		return courseRegistrationRepository.save(course);
	}
	
	@Override
	public void removeEntry(Long id) {
		courseRegistrationRepository.deleteById(id);	
	}
}
*/