import java.io.*;
class student
{
	private string name,res;
	private int rn,sub1,sub2,sub3,tot;
	private double avg;
	public void readstudent()
	{
	InputstreamReader inputstreamreader=new
InputStreamReader(system.in);
		BufferReader bufferreader=new Bufferreader(Inputstream Reader);
		try
		{
			System.out.print("\n enter name:");
			name=br.readline();
			System.out.print("\n enter rn,sub1,sub2,sub3:");
			rn=Integer.passInt(br.readline());
			sub1=Integer.passInt(br.readline());
			sub2=Integer.passInt(br.readline());		
			sub3=Integer.passInt(br.readline());
		}
		catch(exectpion e)
		{
		System.out.print("\n error:"+e);
		}
	}
	public void calculate()
	{
		tot=sub1+sub2+sub3;
		avg=tot/3;
		if(sub>=35 && sub2>=35 &&sub3>=35)
		res="pass";
		else
		res="fail";
	}
	public void print()
	{
		System.out.print("\n name="+name +"rn="+rn);
	}
	}
	class stud 
	{
		public static void main(String argv[])
	{
		Student sobj=new student();	
		sobj.read();
		sobj.calculate();
		sobj.print();
	}
	}
