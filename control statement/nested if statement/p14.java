class p14
{
	public static void main(String[] args)
	{
		char gender = 'F';
		int age = 45;
		
		if ( gender == 'M')
		{
			if(age>=21)
			{
				System.out.println("eligible Bachelor");
			}
			else
			{
				System.out.println("Boy underage");
			
			}
		}
			else if(gender == 'F')
			{
				if(age>=18)
				{
					System.out.println("eligible spinster");
				}
				else
				{
					System.out.println("Girl underage");
				
				}
			}
			else
			{
				System.out.println("select valid gender");
				
			}
		}
	}
