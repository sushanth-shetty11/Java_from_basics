class passAndReturn
{
	static void display(int a)
	{
		System.out.println(a);
		if(a<6)
		{
			a--;
			display(1);   //StackOverflowError
		}
	}
	public static void main(String[] args)
	{
		display(1);
	}
}