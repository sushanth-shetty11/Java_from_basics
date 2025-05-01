class p34
{
	public static void main(String[] args)
	{
		int n=12;
		int a=1;
		int sum=0;
		
		while(a<=n/2)
		{
			if(n%a==0 )
			{
				sum+=a;
			}
			a++;	
		}
		System.out.println(sum);
	}
}