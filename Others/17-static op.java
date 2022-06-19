class my
{
 private static int x;
 private int y;
 public void setvalues(int a,int b)
 {
  x=a;
  y=b;
 }
 public void printvalues()
 {
 System.out.print("\n x="+x +"y="+y);
 }
}
class static1
{
 public static void main(String argv[])
 {
	my obj1=new my();
	my obj2=new my(); 
 obj1.setvalues(10,20);
 System.out.print("\n obj1..");obj1.printvalues();
 System.out.print("\n obj2..");obj2.printvalues();

 obj2.setvalues(99,88);
 System.out.print("\n ..");
 System.out.print("\n obj1..");obj1.printvalues();
 System.out.print("\n obj2..");obj2.printvalues();
 }
}