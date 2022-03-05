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

	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudent(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}
	
	@Override
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}
	
	@Override
	public void removeStudent(Long id) {
		studentRepository.deleteById(id);	
	}
}