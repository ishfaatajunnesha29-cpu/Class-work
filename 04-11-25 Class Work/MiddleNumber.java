import java.util.Scanner;
class MiddleNumber
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the 1st Number: ");
		int num1 = Sc.nextInt();
		System.out.print("Enter the 2nd Number: ");
		int num2 = Sc.nextInt();
		System.out.print("Enter the 3rd Number: ");
		int num3 = Sc.nextInt();
		
		if(((num1>num2)&&(num1<num3))||((num1<num2)&&(num1>num3)))
		{
			System.out.println("The Middle number is: "+num1);
		}
		else if(((num2>num1)&&(num2<num3))||((num2<num1)&&(num2>num3)))
		{
			System.out.println("The Middle number is: "+num2);
		}
		else if(((num3>num1)&&(num3<num2))||((num3<num1)&&(num3>num2)))
		{
			System.out.println("The Middle number is: "+num3);
		}
	}
}