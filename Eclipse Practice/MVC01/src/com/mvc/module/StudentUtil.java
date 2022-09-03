package com.mvc.module;

import java.util.ArrayList;
import java.util.List;

public class StudentUtil {
	public static List<Student> getStudentList(){
		List<Student> students = new ArrayList<>();
		students.add(new Student("Harshit", "Varshney", "hvofficial2@gmail.com"));
		students.add(new Student("Sanchit", "Sharma", "SS2@gmail.com"));
		students.add(new Student("Ravi", "Bhandaru", "Ravi.Bhandaru@gmail.com"));
		students.add(new Student("Sneha", "Sharma", "sneha@gmail.com"));
		return students;
	} 
}
