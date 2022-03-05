package brycklen.project.brycklenvue.entity;

import javax.persistence.*;
import java.util.*;

@Entity
public class Student {
	// Sets ID column for each student through sequential numbering strategy
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	// Sets first name column for each student through sequential numbering strategy
	@Column(name = "FIRST_NAME")
	private String firstName;
	// Sets last name column for each student through sequential numbering strategy
	@Column(name = "LAST_NAME")
	private String lastName;
	// Sets age column for each student through sequential numbering strategy
	@Column(name = "AGE")
	private int age;
	// Connects STUDENT table to COURSE_REGISTRATION
	@OneToMany(mappedBy = "student")
	Set<CourseRegistration> registrations;
	
	// Constructors
	public Student() {}
	
	public Student(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	// Getters and setters
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
