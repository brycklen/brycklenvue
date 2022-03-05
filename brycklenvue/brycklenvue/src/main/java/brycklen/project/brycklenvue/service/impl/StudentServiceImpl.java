package brycklen.project.brycklenvue.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import brycklen.project.brycklenvue.entity.Student;
import brycklen.project.brycklenvue.repository.StudentRepository;
import brycklen.project.brycklenvue.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	// Adds student to database
	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}
	
	// Retrieves student id from database
	@Override
	public Student getStudent(Long id) {
		return studentRepository.findById(id).get();
	}
	
	// Updates student information in database
	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}
	
	// Retrieves ALL students from database
	@Override
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}
	
	// Removes student from database
	@Override
	public void removeStudent(Long id) {
		studentRepository.deleteById(id);	
	}
}