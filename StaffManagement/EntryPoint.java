import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class EntryPoint{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please imput the employee's first name: ");
		String First_Name = scan.nextLine();
		
		System.out.println("Please imput the employee's last name: ");
		String Last_Name = scan.nextLine();

		System.out.println("Please imput the employee's age: ");
		int age = scan.nextInt();

		System.out.println("Please imput the employee's monthly salary: ");
		double Monthly_Salary = scan.nextDouble();

		System.out.println("Employee information: " + First_Name + " " + Last_Name + "," + " " + age + "," + " " + Monthly_Salary);

		Random generator = new Random();
		int a = generator.nextInt(10) +1;
		
		System.out.println("You have " +a+ "insertations left.");
		for(int i=0;i<a;i++) {
			Scanner scn = new Scanner(System.in) ;

			System.out.println("Please input the employee's first name:");
			String First_Name2=scn.nextLine();

			System.out.println("Please input the employee's last name:");
			String Last_Name2=scn.nextLine();

			System.out.println("Please input the employee's age:");
			int age2=scn.nextInt();

			System.out.println("Please input the employee's monthly salary:");
			Double Monthly_salary2=scn.nextDouble();

			DecimalFormat fmt1= new DecimalFormat ("#, #'##.###") ;
			System.out.println("Employee information:"+ First_Name2 + Last_Name2+","+ age2 +","+ fmt1.format (Monthly_salary2));
		}
		
	}
}