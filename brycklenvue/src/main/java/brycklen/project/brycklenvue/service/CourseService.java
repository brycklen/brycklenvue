package brycklen.project.brycklenvue.service;

import java.util.List;
import brycklen.project.brycklenvue.entity.Course;

public interface CourseService {
	List<Course> getAllCourses();
	Course saveCourse(Course course);
	Course getCourseById(Long id);
	Course updateCourse(Course student);
	void deleteCourseById(Long id);
}