package application;

import java.util.HashSet;
import java.util.Set;

import model.entities.Course;
import model.entities.Instructor;
import model.entities.Student;
import model.entities.User;

public class Program {

	public static void main(String[] args) {
		
		User instructor = new Instructor(1, "Alex");
		User student1 = new Student(21, "Nilson");
		User student2 = new Student(35, "Roberto");
		User student3 = new Student(22, "Oliveira");
		User student4 = new Student(50, "Bob");
		User student5 = new Student(42, "Brown");
		User student6 = new Student(13, "Jack");
		
		Course cA = new Course("Course A", instructor);
		cA.addStudent(student1);
		cA.addStudent(student2);
		cA.addStudent(student3);
		
		Course cB = new Course("Course B", instructor);
		cB.addStudent(student1);
		cB.addStudent(student4);
		
		Course cC = new Course("Course C", instructor);
		cC.addStudent(student5);
		cC.addStudent(student2);
		cC.addStudent(student6);
		
		Set<User> setA = new HashSet<>();
		Set<User> setB = new HashSet<>();
		Set<User> setC = new HashSet<>();
		
		for(User user : cA.getList()) {
			setA.add(user);
		}
		
		for(User user : cB.getList()) {
			setB.add(user);
		}
		
		for(User user : cC.getList()) {
			setC.add(user);
		}
		
		Set<User> setTotal = new HashSet<>(setA);
		setTotal.addAll(setB);
		setTotal.addAll(setC);
		
		System.out.print("How many students for course A? " + setA.size());
		cA.printStudentId();
		
		System.out.print("How many students for course B? " + setB.size());
		cB.printStudentId();
		
		System.out.print("How many students for course C? " + setC.size());
		cC.printStudentId();

		System.out.println("Total students: " + setTotal.size());
	}

}
