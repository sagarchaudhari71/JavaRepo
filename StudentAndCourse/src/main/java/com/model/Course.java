package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int cid;
private String course;

@Override
public String toString() {
	return "Course [cid=" + cid + ", course=" + course + ", student=" + student + "]";
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
@ManyToOne
private Student student;
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
}
