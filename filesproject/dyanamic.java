import java.io.*;
class bank
{
	private String name;
	private int accno;
	public bank()
	{
		InputStreamReader inputstreamreader=new InputStreamReader(System.in);
		BufferedReader bufferedreader=new Bufferedreader(inputstreamreader);
	try
	{
		System.out.print("\n enter name,accno:");
		name=bufferedreader.readLine();
		accno=Integer.parseInt(br.readLines);
	}
	catch(Exception e)
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
	b1.printbank();
	}
}