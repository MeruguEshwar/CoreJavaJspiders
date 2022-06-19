class Addition
{
	public static int add(int i,int j) 
	{
		return i+j;
	}
	
	private static void add(int i,int j,int k) 
	{
		System.out.println(i+j+k);
	}

	public void add(int a,double b) 
	{
		System.out.println(a+b);
	}


	public static void main(String[] args) 
	{
		int res=add(5,6);
		System.out.println(res);

		add(3,4,5);

		Addition add=new Addition();
		add.add(2,2.3);

		
	}

}
