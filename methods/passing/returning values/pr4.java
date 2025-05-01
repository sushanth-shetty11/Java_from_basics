class pr4
{
	static boolean findPrimeNumber(int n)
	{
		int a=1;
		int count=0;
		while(a<=n/2)
		{
			if(n%a==0)
			{
				count++;
			}
			a++;
		}
		if(count==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}
	public static void main(String[] args)
	{
		for(int a=1; a<=100; a++)
		{
			boolean bool=findPrimeNumber(a);
			if(bool==true)
			{
				System.out.println(a);
			}
		}
	}
}