import java.io.FileWriter;  // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class ExpensesTracker{

  	public static void main(String[] args){
  
    	try {
		FileWriter fw = new FileWriter("expenses.txt",true);
	
		Scanner scan = new Scanner(System.in);
	
		String name;
		String item;
		String yes = "y";
		String no = "n";
		double price;
		String output;

		System.out.println("Input your name: ");
		name = scan.nextLine();

		System.out.println("What did you purchase: ");
		item = scan.nextLine();
		
		System.out.println("How much did you pay: ");
		price = scan.nextDouble();

		scan.nextLine();

		fw.write("<" + name + " > purchased < " + item + " > for < " + price + " > US Dollars.");
		
		
		System.out.println("Would you like to log another purchase?(y/n): ");
		output = scan.nextLine();
		
		
		while(output.equals(yes)){
		
			System.out.println("Input your name: ");
			name = scan.nextLine();

			System.out.println("What did you purchase: ");
			item = scan.nextLine();
		
			System.out.println("How much did you pay: ");
			price = scan.nextDouble();

			scan.nextLine();

			System.out.println("Would you like to log another purchase?(y/n): ");
			output = scan.nextLine();

			fw.write("<" + name + " > purchased < " + item + " > for < " + price + " > US Dollars.");
		
		}

		if(output.equals(no)) { 

		System.out.println("Get off of ZoodMall!");
        	
		}

		fw.close();

      	// If you have already have a expenses.txt file, you need to delete it
      	// before you compile your code again

   	 } catch (IOException e) {
      		System.out.println("An error occurred.");
      		e.printStackTrace();
    	}
    }
}