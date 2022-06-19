class Overlad 
{
	public static void main(String[] args) 
	{
		move(81);
	}

	public static int move(int a) 
	{
		System.out.println("Move "+a+" kms");
	}

	public String move(String b) 
	{
		System.out.println("move towards "+b+" direction");
	}
}
