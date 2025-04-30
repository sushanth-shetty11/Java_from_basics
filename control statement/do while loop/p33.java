class dowhile
{
	public static void main(String[] args)
	{
		int n=12;
		int a=1;
		
		while(a<=n/2)
		{
			if(n%a==0)
			{
				System.out.println(a);
			}
			a++;
		}
	}
}