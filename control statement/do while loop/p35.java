public class p35
{
	public static void main(String[] args)
	{
		int n=9;
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
		if(n==sum)
		{
			System.out.println("Its a perfect number");
		}
		else
		{
			System.out.println("Its not a perfect number");
		}
		
	}
    
}
