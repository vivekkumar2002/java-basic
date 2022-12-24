package beginning;

import java.util.Scanner;
public class student {

	public static void main(String[] Strings) {

	 double root1, root2;
        Scanner input = new Scanner(System.in);
        

            System.out.print("Input a: ");
            double a = input.nextDouble();
            System.out.print("Input b: ");
            double b = input.nextDouble();
            System.out.print("Input c: ");
            double c = input.nextDouble();

         // calculate the determinant (b2 - 4ac)
            double determinant = b * b - 4 * a * c;

            // check if determinant is greater than 0
            if (determinant > 0) {

              // two real and distinct roots
              root1 = (-b + Math.sqrt(determinant)) / (2 * a);
              root2 = (-b - Math.sqrt(determinant)) / (2 * a);

              System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
            }

            // check if determinant is equal to 0
            else if (determinant == 0) {

              // two real and equal roots
              // determinant is equal to 0
              // so -b + 0 == -b
              root1 = root2 = -b / (2 * a);
              System.out.format("root1 = root2 = %.2f;", root1);
            }

            // if determinant is less than zero
            else {

              // roots are complex number and distinct
              double real = -b / (2 * a);
              double imaginary = Math.sqrt(-determinant) / (2 * a);
              System.out.format("root1 = %.2f+%.2fi", real, imaginary);
              System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
            }
          }
        }

