class SecondMax
{
	public static void main(String[] args)
	{
		int ar[]={12,7,2,5,22,18,32};
		SecondMax s = new SecondMax();
		int result = s.max(ar);
		System.out.print("The Second Maximum Number is: "+result);
	}
	int max(int arr[])
	{
		int max=32;
		int secMax=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]>secMax)&&(arr[i]<max))
			{
				secMax=arr[i];
			}
		}
		return secMax;
	}
}