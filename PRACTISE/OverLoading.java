class OverLoading 
{
	public static int add(int a,int b)
	{
			return a+b;
	}
	private static void add(int a,int b,int c)
	{
			System.out.println(a+b+c);
	}
	public  void add(int a,double b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
			int res = add(2,3);
			System.out.println(res);
			
			add(2,4,5);

			OverLoading obj = new OverLoading();
			obj.add(2,3.3);
			System.out.println("Dz is method overLoading");
	}
}
