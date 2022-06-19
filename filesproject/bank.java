class bank
{
	private string name;
	private int accno;
	public bank()
	{
		name="A";
		accno="101";
	}
	public bank(String name)
	{
		this.name=name;
		this .accno=accno;
	}
	public void printbank()
	{
		System.out.print("\n name="+name +"accno="+accno);
	}
}
class bank
{
	public static void main(String argv[])
	{
		bank b1=new bank();
		bank b2=new bank("c",103);
		bank b3=new bank("c",103);
		System.out.print("\n b1....);b1.print bank();
		System.out.print("\n b2....);b2.print bank();
		System.out.print("\n b3....);b3.print bank();
	}
}
