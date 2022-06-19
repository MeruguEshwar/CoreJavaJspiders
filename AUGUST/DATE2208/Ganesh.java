class Ganesh 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		nani();

		Ganesh obj=new Ganesh();
		obj.mani();
	}

	public static void nani() 
	{
		System.out.println("this is static");
	}

	public void mani() 
	{
		System.out.println("this is non static");
	}
}
