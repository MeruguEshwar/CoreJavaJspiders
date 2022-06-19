class rank 
{
	public static void main(String[] args) 
	{
		int marks=45;
		if((marks >= 90) && (marks <= 100))
		{
			System.out.println("1st Rank...");
		}
		else if((marks >= 80) && (marks <= 89))
		{
			System.out.println("2nd Rank...");
		}
		else if((marks >= 70) && (marks <= 79))
		{
			System.out.println("3rd Rank...");
		}
		else if((marks >=60) && (marks <=69)) 
		{
			System.out.println("Pass....");
		}
		else
		{
			System.out.println("Fail...");
		}
	}
}
