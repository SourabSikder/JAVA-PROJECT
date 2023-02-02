package LabTest1;

public class Employee extends Person {
	//instance variables
	int eid;
	String dept;
	int salary;
	//default constructor
	Employee()
	{
		System.out.println("Default Constructor of Employee");
	}
	//parameterized constructor
	Employee(int eid, String dept, int salary) {
		this.eid = eid;
		this.dept = dept;
		this.salary = salary;
	}
	//to display the information
	public void display_Employee()
	{
		System.out.println("E id="+eid);
		System.out.println("Dept="+dept);
		System.out.println("salaey="+salary);
	}
}
