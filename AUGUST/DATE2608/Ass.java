class Ass
{
	double leng;
	int breath;
	public Ass(double a,int b)
	{
		leng=a;
		breath=b;
	}
	public void printPerimeter( )
	{
		System.out.println(2*(leng+breath));
	}
	public static void main(String[] args) 
	{
		Ass A1=new Ass(5.5,3);
		A1.printPerimeter();
		Ass A2=new Ass(6.5,2);
		A2.printPerimeter();
		Ass A3=new Ass(7.5,4);
		A3.printPerimeter();

	}
}
