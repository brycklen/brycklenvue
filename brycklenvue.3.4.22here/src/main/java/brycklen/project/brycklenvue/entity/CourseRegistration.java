package brycklen.project.brycklenvue.entity;

import javax.persistence.*;

@Entity
class CourseRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    Student student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    Course course;

    public CourseRegistration() {
		
	}
	
	public CourseRegistration(Student student, Course course) {
		super();
		this.student = student;
		this.course = course;
	}
	
	public Long getId() {
		return id;
	}
	
	public Long setId(Long id) {
		return id;
	}
	
}
