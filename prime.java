package beginning;
import java.util.Scanner;

public class prime {

	public static void main(String args[]) {
		Scanner input =new Scanner(System.in);
		int i,m=0,flag=0;
		
		System.out.print("Enter the number: \n");
		int n=input.nextInt();

		m=n/2;
		if(n==0||n==1)
		{
			System.out.println( n+ " is not a prime number ");
		}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+ " is not a prime number");
					flag=1;
					break;
					
				}
			}
			if(flag==0)
			{
				System.out.println(n+ " is a prime number");
			}
		}
	}

}
