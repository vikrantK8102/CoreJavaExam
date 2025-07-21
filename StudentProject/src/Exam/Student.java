package Exam;

public class Student {

	int rollno;
	String name;
	int marks;
	
	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	public Student(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

	
	
}


