package brycklen.project.brycklenvue.entity;

import javax.persistence.*;
import java.util.*;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "COURSE_NAME")
	private String courseName;
	
	@OneToMany(mappedBy = "course")
	Set<CourseRegistration> registrations;
	
	public Course() {
		
	}
	
	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}
	
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