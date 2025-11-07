class SumArray
{
	public static void main(String[] args)
	{
		int ar[]={13,26,5,20,13,7};
		SumArray s = new SumArray();
		int res = s.add(ar);
		System.out.println(res);
	}
	int add(int ar[])
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
		sum=sum+ar[i];
		}
		return sum;
	}
}