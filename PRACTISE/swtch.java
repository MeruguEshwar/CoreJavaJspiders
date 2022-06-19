class swtch 
{
	public static void main(String[] args) 
	{
		char grade='ch';
		switch(grade)
		{
			case 'A':System.out.println("1st rank:");
			break;

			case 'B':System.out.println("2nd rank:");
			break;

			case 'C':System.out.println("3rd rank:");
			break;

			case 'D':System.out.println("Pass....:");
			break;

			case 'E':System.out.println("Fail....:");
			break;

			default:System.out.println("Invalid....");
			break;
		}
	}
}
