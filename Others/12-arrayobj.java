class A
{
	public int x,y;
	public void print()
	{
		System.out.print("\n x="+x +"y="+y);
	}
	class arrayobj
	{
		public static void main(String argv[])
		{
		obj[0]=new A();
		obj[1]=new A();
		obj[2]=new A();

		obj[0].x=5;obj[0].y=8;
		obj[1].x=12;obj[0].y=99;
		obj[2].x=8;obj[0].y=120;
for(int j=0;j<=3;j++)
{
obj[j].print();
}
}
