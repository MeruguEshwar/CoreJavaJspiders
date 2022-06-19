class math
{
  public void sum(int x,int y)
  {
 	System.out.print("\n sum="+(x+y));
  }

  public void sum(int x,int y,int z)
  {
	 System.out.print("\n sum="+(x+y+z));
  }

  public void sum(double x,double y)
  {
	System.out.print("\n ="+(x+y));
  }
}
class nani
  {
 	public static void main(String argv[])
  {
	math obj=new math();
	int a=10,b=20,c=30;
	double d1=5.5,d2=6.6;
	obj.sum(a,b);
	obj.sum(a,b,c);
	obj.sum(d1,d2);
  }
  }