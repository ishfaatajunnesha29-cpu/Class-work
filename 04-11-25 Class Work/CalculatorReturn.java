import java.util.Scanner;
class CalculatorReturn
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
		CalculatorReturn n = new CalculatorReturn();
	    System.out.print(n.calc(a,b,ch));
	}
	public double calc(double a, double b, char ch)
	{
		double c = 0;
		switch(ch)
		{
			case '+':
			c = a+b;
			break;
			case '-':
			c = a-b;
			break;
			case '*':
			c = a*b;
			break;
			case '/':
			c = a/b;
			break;
			default:
			System.out.println("Sorry you are entered a wrong operation");
		}
		return c;
	}
}