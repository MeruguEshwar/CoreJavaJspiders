class bank
{
    private string name;
    private int acno;
    public void setbank(String name,int accno)
    {
      this.name=name;
      this.accno=accno;
    }
    public void printbank()
    {
      System.out.print("\n name="+name+"acccno="+accno);
    }
}
class my
{
public static void main(String argv[])
	{
	bank.obj=new bank();
	obj.setbank=("Raju",105);
	obj.printbank();
	}
}