class  acunt
{
private string acname;
private int acno;
private double bal;
 public void creataccount(String name,int acno,double bal)
{
System.out.print("\n account created:");
}
public void printaccount()
{
System.out.print("\n account printed:");
}
public void deposit(double amont)
{
bal=bal+amont;
System.out.print("\n amont deposited :"+amont);
System.out.print("\n your current bal:"+bal);
}
public void withdraw(double amont)
{
bal=bal-amont;
System.out.print("\n amont deposited :"+amont);
System.out.print("\n your current bal:");
print(accounts);
}
}
class class2
{
pulic static void main(String argv[])
{
accounts acc=new accounts();
acc.createaccount("Raju",1492,1000.00);
acc.printaccount();
System.out.print("\n ac is printed:");
acc.printed();
}
}