class p11
{
	public static void main(String[] args)
	{
		int per=9;
		
		if(per>=85)
		{
			System.out.println("Distinction");
		}
		else if(per>=70 && per<85)
		{
			System.out.println("First Class");
		}
		else if(per>=60 && per<70)
		{
			System.out.println("Second Class");
		}
		else if(per>=35 && per<60)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
			
		}
	}
}