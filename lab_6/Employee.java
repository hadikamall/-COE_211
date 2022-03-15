import java.util.Scanner;
public class Employee {
	

	
	private double salary;;
	private int age;
	 private String firstName ;
	 private String lastName;
	 
	 
	 
	public Employee(){
	Scanner s=new Scanner(System.in);
	System.out.println("input the employee's first name:");
	firstName=s.nextLine();
	System.out.println("input the employee's last name:");
	lastName=s.nextLine();
	
	
	System.out.println("input the employee's age :");
	age=s.nextInt();
	System.out.println("input the employees's monthly salary");
	salary=s.nextDouble();	
	}
	
	
	public String toString() {
		return"Employee information : "+firstName+" "+lastName+", "+age+" , "+salary;}


	
		
	}


	
	
		
	