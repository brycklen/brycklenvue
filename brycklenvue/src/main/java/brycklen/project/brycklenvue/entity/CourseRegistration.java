package brycklen.project.brycklenvue.entity;

import javax.persistence.*;

@Entity
class CourseRegistration {
	// Sets ID column for each course/student relationship through sequential numbering strategy
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    // Connecting student_id column to student table
    @ManyToOne
    @JoinColumn(name = "student_id")
    Student student;
    // Connecting course_id column to course table
    @ManyToOne
    @JoinColumn(name = "course_id")
    Course course;
    
    // Constructors
    public CourseRegistration() {}
	
	public CourseRegistration(Student student, Course course) {
		super();
		this.student = student;
		this.course = course;
	}
	
	// Getter and setter
	public Long getId() {
		return id;
	}
	
	public Long setId(Long id) {
		return id;
	}
	
}
