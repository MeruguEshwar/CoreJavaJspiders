/* create a class with main method and access all the classes static and non static members */ 
class main 
{
	public static void main(String[] args) 
	{
		System.out.println("************Accessed A class********");
		A.nani();
		A obj=new A();
		obj.mani();
		
		
		System.out.println("************Accessed B class********");
		B B1=new B();
		System.out.println(B1.i);
		System.out.println(B.j);
		
		System.out.println("************Accessed C class********");
		System.out.println(C.L);
		C.chintu();
		C c1=new C();
		System.out.println(c1.k);
		
		
	}
}
