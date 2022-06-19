class student
{
	public static void main(String[] args) 
	{
		char res='B';
		if((res == 'A') || (res == 'a'))
		{
			System.out.println("1st rank");
		}
		else if((res == 'B') || (res == 'b'))
		{
			System.out.println("2nd rank...");
		}
		else if((res == 'C') || (res == 'c'))
		{
			System.out.println("PASS...");
		}
		else
		{
			System.out.println("Fail....");
		}
	}
}
