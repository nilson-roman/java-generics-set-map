package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Course {

	private String name;
	private User instructor;
	
	private List<User> list = new ArrayList<>();
	
	public Course(String name, User instructor) {
		this.name = name;
		this.instructor = instructor;
		instructor.addCourse(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstructorName() {
		return instructor.getName();
	}

	public void setInstructorName(String name) {
		instructor.setName(name);
	}

	public List<User> getList() {
		return list;
	}

	public void addStudent(User student) {
		list.add(student);
		student.addCourse(this);
	}
	
	public void printResume() {
		System.out.println();
		System.out.println(getName());
		System.out.println("Instructor: " + instructor.getName());
		System.out.println("Course students:");
		for(User s : list) {
			System.out.println(s.getName());
		}
	}
	
	public void printStudentId() {
		System.out.println();
		for(User s : list) {
			System.out.println(s.getId());
		}
	}
}
