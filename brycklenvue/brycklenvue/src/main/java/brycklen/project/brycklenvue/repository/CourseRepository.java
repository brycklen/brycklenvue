package brycklen.project.brycklenvue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import brycklen.project.brycklenvue.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {}