class ass 
{
	public static void main(String[] args) 
	{
		int n=9;
		if((n%3==0) && (n%5==0))
		{
			System.out.println("good evng");
		}
		else if ((n%3==0))
		{
			System.out.println("good noon");
		}
		else if(n%5==0)
		{
			System.out.println("good morning");
		}
		else 
		{
				System.out.println("good night");
		}
	}
}
