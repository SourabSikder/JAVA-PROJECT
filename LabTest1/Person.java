package LabTest1;

public class Person {
	//instance variables
	String name;
	int age;
	String address;
	String mobilenumber;
	//default constructor
	Person()
	{
		System.out.println("Default Constructor....");
		
	}
	//parameterized constructor
	Person(String name, int age, String address, String mobilenumber) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobilenumber = mobilenumber;
		}
	//to display the information
	public void display_person()
	{
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Address="+address);
		System.out.println("Phone Number="+mobilenumber);
	}
}
