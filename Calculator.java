package beginning;

import java.util.Scanner;
public class Calculator {
	public static void main(String[] args)
	{

	    char operator;
	    

	    // create an object of Scanner class
	    Scanner input = new Scanner(System.in);

	    // ask users to enter operator
	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = input.next().charAt(0);

	    // ask users to enter numbers
	    System.out.println("Enter first number");
	   double number1 = input.nextDouble();

	    System.out.println("Enter second number");
	   double number2 = input.nextDouble();

	    switch (operator) {

	      // performs addition between numbers
	      case '+':
	       double result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      // performs subtraction between numbers
	      case '-':
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      // performs multiplication between numbers
	      case '*':
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;

	      // performs division between numbers
	      case '/':
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	
	    }

	    input.close();
	  }
}
