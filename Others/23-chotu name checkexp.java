class bank
{
	private String name;
	private int accno;
	public void set(String name,int accno)
	{
		this.name=name;
		this.accno=accno;
	}
	public String toString()
	{
		return("\nname="+name+"\naccno="+accno);
	}
}
class chotu
{
	public static void main(String argv[])
	{
		bank obj=new bank();
		obj.set("Raju",105);
		System.out.print(obj);
		String str;
		str="\n bank:"+obj;
		System.out.print("\n"+str);
		

	}
}