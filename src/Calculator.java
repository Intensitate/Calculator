import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Your operator + - * /: ");
		String operation = userInput.nextLine();
		
		System.out.print("Enter first number: ");
		double num1 = userInput.nextDouble();
		
		System.out.print("Enter second number: ");
		double num2 = userInput.nextDouble();
		
		double sum = num1+num2;
		double sub = num1-num2;
		double multi = num1*num2;
		double div = num1/num2;
		
		if (operation.equals("+")) {
			System.out.println("Your result is: " + sum);
		} else if (operation.equals("-")) {
			System.out.println("Your result is: " + sub);
		} else if (operation.equals("*")) {
			System.out.println("Your result is: " + multi);
		}
		else if (operation.equals("/")) {
			System.out.println("Your result is: " + div);
		} else {
			System.out.println("Unrecognized operator");
		}
		
		
		
		
		
		
		
		


		
	}

}
