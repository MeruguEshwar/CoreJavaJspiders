class complex
{
 private double real,img;
 public void set complex(double real,double img)
 {
	this.real=real;
	this.img=img;
 }
 public void print complex()
 {
  System.out.print("\n complex="+(real+img));
 }
 public void add complex(complex obj1,complex obj2)
 {
	this.real=obj1.real+obj2.real;
	this.img=obj1.img+obj2.img;
 }
}
class addobjs
{
 public static void main(String argv[])
 {
 complex c1=new complex();
 complex c2=new complex();
 complex c3=new complex();

 c1.setcomplex(5.2,-3.5);
 c2.setcomplex(6.4,-2.2);
 c3.addcomplex(c1,c2);

	System.out.print("\n c1 ");c1.printcomplex();
	System.out.print("\n c2 ");c2.printcomplex();
	System.out.print("\n c3 ");c3.printcomplex();
	
 }
}