class Mainbank
{
	public static void main(String argv[])
	{
			SavingAccount obj1=new SavingAccount(101,"nani",1000.0,500);
			obj1.displayAccountDetails();

			SalariedAccount obj2=new SalariedAccount(201,"chintu",2000.0,"HCL");
			obj2.displayAccountDetails();
	}
}