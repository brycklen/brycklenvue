package brycklen.project.brycklenvue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import brycklen.project.brycklenvue.entity.Course;
import brycklen.project.brycklenvue.entity.Student;

public interface CourseRegistrationRepository extends JpaRepository<Course, Student> {}