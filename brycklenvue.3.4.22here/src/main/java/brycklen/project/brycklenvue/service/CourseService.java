package brycklen.project.brycklenvue.service;

import java.util.List;
import brycklen.project.brycklenvue.entity.Course;

public interface CourseService {
	Course addCourse(Course course);
	Course getCourse(Long id);
	Course updateCourse(Course course);
	List<Course> getCourses();
	void removeCourse(Long id);
}