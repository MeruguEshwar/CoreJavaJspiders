class Account 
{
	int accNum;
	String accHolderName;
	double bal;
	static int minBal=500;;

	Account(int accNum,String accHolderName,double bal)
	{
		this.accNum = accNum;
		this.accHolderName = accHolderName;
		this.bal = bal; 
	}

	public void displayAccInfo()
	{
		System.out.println("accno is:"+accNum);
		System.out.println("accHolderName:"+accHolderName);
		System.out.println("bal:"+bal);
		System.out.println("minBal:"+minBal);	
	}

	public static void main(String[] args) 
	{
			Account A1 = new Account(100,"nani",200.0);
			Account A2 = new Account(101,"chintu",300.0);

			A1.displayAccInfo();
			A2.displayAccInfo();
	}
}
