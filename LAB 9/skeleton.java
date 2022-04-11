import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

        // Initialize array of integers
		int grades[] = new int[5];
		int assignment;
		int sum = 0;

        // for loop to get user input & store in array
		for(int x = 1; x <= 5; x++){
			System.out.println("Input the grade of assignment " + x + ":");
			assignment = scan.nextInt();
			grades[x-1] = assignment;	
		} 

		System.out.print("Input the number of attended labs: ");
		int labs = scan.nextInt();

		System.out.print("Input the midterm grade: ");
		int mid = scan.nextInt();

		for(int i = 0; i<5; i++) {		
			sum = sum + grades[i];
			}

		double gradesAv = ((double)sum/5)*0.3;
		double attendance = (labs*100)*0.05;
		double midterm = 0.3*mid;

		System.out.println("Assignment (30%): " + (int)gradesAv);
		System.out.println("Attendance (5%): " + (int) attendance);
		System.out.println("Midterm (30%): " + (int) midterm);
		
    	}
}