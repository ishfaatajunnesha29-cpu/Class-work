import java.util.Scanner;
class Calculator
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter a first number: ");
		double a = Sc.nextDouble();
		System.out.print("Enter a second number: ");
		double b = Sc.nextDouble();
		System.out.print("Enter a operation: ");
		char ch = Sc.next().charAt(0);
		Calculator n = new Calculator();
	    n.calc(a,b,ch);
	}
	public void calc(double a, double b, char ch)
	{
		switch(ch)
		{
			case '+':
			System.out.println(a+" "+ch+" "+b+" = "+(a+b));
			break;
			case '-':
			System.out.println(a+" "+ch+" "+b+" = "+(a-b));
			break;
			case '*':
			System.out.println(a+" "+ch+" "+b+" = "+(a*b));
			break;
			case '/':
			System.out.println(a+" "+ch+" "+b+" = "+(a/b));
			break;
			
			default:
			System.out.println("Sorry you are entered a wrong operation");
		}
	}
		
}