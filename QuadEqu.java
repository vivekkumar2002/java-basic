package beginning;

import java.util.Scanner;

public class QuadEqu {

	public static void main(String[] args)
	{
		double root1,root2;
		Scanner input =new Scanner(System.in);
		System.out.print("Input a: ");
		double a=input.nextDouble();
		System.out.print("Input b:");
		double b=input.nextDouble();
		System.out.print("Input c: ");
		double c=input.nextDouble();
		
		double descriminant=b*b-4*a*c;
		if(descriminant>0)
		{
			root1= (-b+Math.sqrt(descriminant))/(2*a);
			root2= (-b-Math.sqrt(descriminant))/(2*a);
			System.out.format("root1=%.2f root2=%.2f", root1,root2);
		}
		else if(descriminant==0)
		{
			root1=root2=-b/(2*a);
			System.out.format("root1=root2=%.2f",root1);
		}
		else
		{
			double real=-b/(2*a);
			double imaginary=Math.sqrt(-descriminant);
			System.out.format("root1=%.2f+%.2fi ",real,imaginary);
			System.out.format("root2=%.2f-%.2fi ",real,imaginary);
		}
		
	}

}
