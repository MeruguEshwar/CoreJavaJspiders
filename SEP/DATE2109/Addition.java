class Addition 
{
	public static void add(int i,int j) 
	{
		System.out.println(i+j);
	}

	public static void add(double i,double j) 
	{
		System.out.println(i+j);
	}

	public static void add(int i,double j) 
	{
		System.out.println(i+j);
	}

	public static void main(String[] args) 
	{
		Addition a = new Addition();
		add(2,3);
		add(3.2,2.3);
		add(3,2.2);
	}
}
