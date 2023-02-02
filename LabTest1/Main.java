package LabTest1;

public class Main {
	public static void main(String[] args)
	{
		//create an instance of person class
		Person p=new Person("ABC",23,"KOLKATA","123456789");
		//call the display function of person class using instance
		p.display_person();
		//create an instance of employee class
		Employee e=new Employee(01,"CSE",20000);
		//call the display function of employee class using instance
		e.display_Employee();
	}

}
