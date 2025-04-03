class p13
{
	public static void main(String[] args)
	{
		double a= 10000;
		int amt = 3050;
		
		if(amt <= a)
		{
			if(amt%100==0)
			{
				System.out.println("withdraw success");
				
			}
			else
			{
				System.out.println("invalid denomination");
			}
		}
		else
		{
			System.out.println("insufficien balance");
		}
		
	}
}