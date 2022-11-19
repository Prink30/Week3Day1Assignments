package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Student name is Reena");
	}
	
	public void studentDept() {
		System.out.println("Student Department is EEE");
	}
	
	public void studentId() {
		System.out.println("Student ID is 118");
	}
	
	public static void main(String[] args) {
		
		Student obj = new Student();
		
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		obj.deptName();
		obj.studentDept();
		obj.studentName();
		obj.studentId();
		
		
		
		
	}
	
}
