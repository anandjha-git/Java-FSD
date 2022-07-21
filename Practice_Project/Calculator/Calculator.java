package mycalculator;
import java.util.Scanner;
public class Calculator {
	public static void main(String args[]){
		char operator;	// Declare char data type variable 'operator' to specify the arithmetic operation
		double num1, num2; // Declare double data type variables 'num1 & num2' on which operation will be performed
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number : ");
		num1 = sc.nextDouble();
		System.out.print("Choose Operator One of Them (+,-,*,/) : ");
		operator = sc.next().charAt(0);
		System.out.println("Enter 2nd Number : ");
		num2 = sc.nextDouble();
		switch(operator){
		case '+':
			System.out.println(num1+" + "+num2+" = "+(num1+num2));
			break;
		case '-':
			System.out.println(num1+" - "+num2+" = "+(num1-num2));
			break;
		case '*':
			System.out.println(num1+" * "+num2+" = "+(num1*num2));
			break;
		case '/':
			System.out.println(num1+" / "+num2+" = "+(num1/num2));
			break;
		default:
			System.out.println("You have entered Invalid Operator, Try Again");
			break;
		}
	}

}

//output
/*

Enter 1st Number : 
34
Choose Operator One of Them (+,-,*,/) : *
Enter 2nd Number : 
5
34.0 * 5.0 = 170.0

 */
