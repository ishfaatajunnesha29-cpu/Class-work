class ArmsPali
{
	public static void main(String[] args)
	{
		int ar[]={153,1551};
		ArmsPali ap = new ArmsPali();
		int res1 = ap.arms(ar);
		int res2 = ap.pali(ar);
		System.out.println(res1+" is a Armstrong Number");
		System.out.println(res2+" is a Palindrome Number");
	}
	int arms(int arr[])
	{ 
	    int num=arr[0];
		int temp=num;
	    int rem=0;
		int sum=0;
		while(arr[0]>0)
		{
			rem=arr[0]%10;
			sum=sum+(rem*rem*rem);
			arr[0]=arr[0]/10;
		}
		if(temp==sum)
		{
			sum=temp;
		}
		return sum;
	}
	int pali(int arr[])
	{
		int num=arr[1];
		int temp=num;
		int rem=0;
		int sum=0;
		while(arr[1]>0)
		{
			rem=arr[1]%10;
			sum=rem+(sum*10);
			arr[1]=arr[1]/10;
		}
		if(temp==sum)
		{
			sum=temp;
		}
		return sum;
	}
}