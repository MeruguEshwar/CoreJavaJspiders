/*Dz is the static method and non static methods of main method */
class Nani 
{
	public static void sq(int m)
	{
		int sq=m*m;
		System.out.println("sq="+sq);
	}
	public void area(int a,int b)
	{
		double area=0.5*a*b;
		System.out.println("area of an tri="+area);
	}
	public static void main(String[] args) 
	{
		sq(2);
		Nani obj=new Nani();
		obj.area(2,4);
	}
}
