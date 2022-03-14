import java.util.Scanner;

public class EntryPoint {
	public static void main (String[] args) {

		Scanner scan = new Scanner(System.in);

		int x;

		System.out.println("Which service would you like to use?");
		x = scan.nextInt();

		if(x>4) {
			System.out.println("Please make sure you pick a number between 1 and 4");
			}
		
		if(x==1) {
			BasicWeek one = new BasicWeek();
			one.printDays();
			}
		if(x==2) {
			AdvancedWeek two = new AdvancedWeek();
			two.printDays();
			}
		if(x==3) {
			Calculator three = new Calculator();
			
			}
		if(x==4) {
			Employee four = new Employee();
			four.toString();
			System.out.println(four);
			}

			

		

	}
}
    
