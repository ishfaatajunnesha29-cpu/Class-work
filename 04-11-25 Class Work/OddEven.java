class OddEven
{
	public static void main(String[] args)
	{
		int ar[]={13,6,25,12,7,14,32,1,17};
		int oddCount=0;
		int evenCount=0;
		int oddSum=0;
		int evenSum=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==1)
			{
				oddSum=oddSum+ar[i];
				oddCount++;
			}
			else 
			{
				evenSum=evenSum+ar[i];
				evenCount++;
			}
		}
		    System.out.println("The Sum of Odd Number is: "+oddSum);
			System.out.println("The Count of Odd Number is: "+oddCount);
			System.out.println("The Sum of Even Number is: "+evenSum);
			System.out.println("The Count of Even Number is: "+evenCount);
	}
}