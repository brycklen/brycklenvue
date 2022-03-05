package brycklen.project.brycklenvue.service;

import java.util.List;
import brycklen.project.brycklenvue.entity.Student;

public interface StudentService {
	Student addStudent(Student student);
	Student getStudent(Long id);
	Student updateStudent(Student student);
	List<Student> getStudents();
	void removeStudent(Long id);
}