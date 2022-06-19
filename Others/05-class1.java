class sample
{
private int a,b,c;
public void setvalues(int x,int y)
{
a=x;
b=y;
}
public void sum()
{
c=a+b;
System.out.print("\n sum="+c);
}
public void sub()
{
c=a-b;
System.out.print("\n sub="+c);
}
}
class class1
{
public static void main(String argv[])
{
	sample obj=new sample();
	obj.setvalues(10,20);
	obj.sum();
	obj.sum();
	obj.sub();
}
}