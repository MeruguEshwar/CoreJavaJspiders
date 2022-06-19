import java.io.*;
class bank1
{
	private String name;
	private int accno;
	public bank1()
	{
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		try
		{
			System.out.print("\n enter name,accno:");
			name=br.readLine();
			accno=Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.print("\n error:"+e);
		}
}
		public void showbank1()
		{
			System.out.print("\n name="+name +"\t accno="+accno);
		}
	
}
class cost
{
	public static void main(String argv[])
	{
	bank1 b1=new bank1();
	System.out.print("\n b1.values.....");
	b1.showbank1();
	}
}