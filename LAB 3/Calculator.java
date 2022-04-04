import java.util.Scanner;

public class Calculator {
    private int n1;
    private int n2;
    private String operator;
    private int answer;

    public Calculator() {
        
        Scanner scan = new Scanner(System.in);

	System.out.println("Input the operator: ");
	operator = scan.nextLine();

	System.out.println("Input the first number: ");
	n1 = scan.nextInt();	
	
	System.out.println("Input the second number: ");
	n2 = scan.nextInt();
	

	if(operator.equals("+")) {
		System.out.println(add(n1,n2));
		}
	
	if(operator.equals("-")) {
		System.out.println(subtract(n1,n2));
		}

	  if(operator.equals("*")) { 	
		System.out.println(multiply(n1,n2));
		}

	 if(operator.equals("/")) {
	System.out.println(divide(n1,n2));
		}
	
	
	
    }

    	public String add(int a, int b) {	
		return a + "+" + b + "=" + (a + b);
       		}
    

   	 public String subtract(int a, int b) {	
		return a + "-" + b + "=" + (a-b);
   		}
	

    	public String multiply(int a, int b) {  
		return a + "*" + b + "=" + (a*b);
		}


    	public String divide(int a, int b) {     
		return a + "/" + b + "=" + (a/b);
    		}
}