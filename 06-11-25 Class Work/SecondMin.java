class SecondMin
{
	public static void main(String[] args)
	{
		int ar[]={12,7,2,5,22,18,32};
		SecondMin s = new SecondMin();
		int res = s.min(ar);
		System.out.print("The Second Minimum Number is: "+res);
	}
	int min(int arr[])
	{
		int min=2;
		int secondMin=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]<secondMin)&&(arr[i]>min))
			{
				secondMin=arr[i];
			}
		}
		return secondMin;
	}
}