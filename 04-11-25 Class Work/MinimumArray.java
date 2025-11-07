import java.util.Scanner;
class MinimumArray
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the length: ");
		int len = Sc.nextInt();
		int ar[] = new int[len];
		System.out.print("Enter a Number: ");
		ar[0]=Sc.nextInt();
		int min = ar[0];
		for(int i=1;i<ar.length;i++)
		{
			System.out.print("Enter a Number: ");
			ar[i] = Sc.nextInt();
			if(ar[i]<min)
			{
				min=ar[i];
			}
		}
			System.out.println("The Minimum Number is: "+min);
	}
}