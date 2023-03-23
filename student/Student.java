package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("Student Name");

	}
	public void studentDept() {
		System.out.println("Student Dept");

	}
	public void studentId() {
		System.out.println("Student Id");

	}
	
	public static void main(String[] args) {
		Student St = new Student();
		St.collegeCode();
		St.collegeName();
		St.collegeRank();
		St.deptName();
		St.studentDept();
		St.studentId();
		St.studentName();
	}
	
}
