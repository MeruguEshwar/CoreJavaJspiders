class swtch 
{
	public static void main(String[] args) 
	{
		char grade='C';
		switch (grade)
		{
			case 'A':System.out.println("!st rank:");
			break;

			case 'B':System.out.println("2nd rank:");
			break;

			case 'C':System.out.println("Pass...:");
			break;

			case 'D':System.out.println("Fail....:");
			break;

			default:System.out.println("invalid:");
			break;
		}
		
	}
}
