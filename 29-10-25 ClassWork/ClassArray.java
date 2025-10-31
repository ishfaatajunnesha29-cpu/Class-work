import java.util.Scanner;
class ClassArray
{
	public static void main(String[] args)
	{
		Scanner Sc= new Scanner(System.in);
		System.out.print("Enter the Array Length : ");
		int len = Sc.nextInt();
		
		int ar[]= new int[len];
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("Enter the value of "+i+" value : ");
			ar[i]=Sc.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}