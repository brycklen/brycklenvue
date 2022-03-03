package brycklen.project.brycklenvue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import brycklen.project.brycklenvue.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}