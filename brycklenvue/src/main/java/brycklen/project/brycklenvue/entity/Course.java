package brycklen.project.brycklenvue.entity;

import javax.persistence.*;
import java.util.*;

@Entity
public class Course {
	// Sets ID column for each course through sequential numbering strategy
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	// Sets Course Name for each column
	@Column(name = "COURSE_NAME")
	private String courseName;
	// Connects COURSE table to COURSE_REGISTRATION
	@OneToMany(mappedBy = "course")
	Set<CourseRegistration> registrations;
	
	// Constructors
	public Course() {}
	
	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}
	
	// Getters and setters
	public Long getId() {
		return id;
	}
	
	public Long setId(Long id) {
		return id;
	}
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}