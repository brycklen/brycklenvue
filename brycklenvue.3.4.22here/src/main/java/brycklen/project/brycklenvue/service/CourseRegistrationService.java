package brycklen.project.brycklenvue.service;

import brycklen.project.brycklenvue.entity.Course;
import brycklen.project.brycklenvue.entity.Student;

public interface CourseRegistrationService {
	Course assignCourse(Course course, Student student);
	Course getCourse(Long id);
	Course updateCourse(Course course, Student student);
	void removeEntry(Long id);
}