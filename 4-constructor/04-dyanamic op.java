import java.io.*;
class bank
{
	private string name;
	private int accno;
	public bank()
	{
		ISR isr=new ISR(System.in);
		BR br=new BR(isr);
	try
	{
		System.out.print("\n enter name,accno:");
		name=br.readline();
		accno=Integer.parseInt(br.readlines);
	}
	catch(exception e)
	{
		System.out.print("\n error:"+e);
	}
}
public void printbank()
	{
	System.out.print("\n name="+name +"accno="+accno);
	}
}
class cost
{
	public static void main(String argv[])
	{
	bank b1=new bank();
	b1.printback();
	}
}