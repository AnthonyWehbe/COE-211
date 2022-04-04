import java.util.Scanner;

public class Employee {
    
	private String firstName;
	private String lastName;
	private int age;
	private double salary;

	public Employee() {
	
        	Scanner scan = new Scanner(System.in);

		System.out.println("Please imput your first name :");
		firstName = scan.nextLine();

		System.out.println("Please imput the last name :");
		lastName = scan.nextLine();

		System.out.println("Please imput your age :");
		age = scan.nextInt();

		System.out.println("Please imput your salary :");
		salary = scan.nextDouble();

	}

	public String toString() {

		String output = " firstName: " +  firstName +
			        "\n lastName: " + lastName +
			        "\n age: " + age +
			        "\n salary: " + salary ;
		return output;
        
	}
}