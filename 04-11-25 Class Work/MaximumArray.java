import java.util.Scanner;
class MaximumArray
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		int len = Sc.nextInt();
		int ar[] = new int[len];
		int max = 0;

		for(int i=0;i<ar.length;i++)
		{
			System.out.print("Enter any Number: ");
			ar[i] = Sc.nextInt();
			System.out.println();
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
			System.out.println("The Maximum Number is: "+max);
		
	}
}