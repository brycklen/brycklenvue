package brycklen.project.brycklenvue.entity;

import javax.persistence.*;

@Entity
class CourseRegistration {

    @Id
    Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    Student students;

    @ManyToOne
    @JoinColumn(name = "course_id")
    Course courses;

    // constructors, getters, and setters
}
