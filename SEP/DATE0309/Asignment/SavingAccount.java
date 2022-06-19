class SavingAccount extends Account
{
	int minBal;
	
	SavingAccount(int Accno,String AccHolderName,double Bal,int minBal) 
	{
		super(Accno,AccHolderName,Bal);
		this.minBal = minBal;
	}
	public void displayAccountDetails()
	{
		System.out.println("********SavingAccount*****");
		details();
		System.out.println("minBal:"+minBal);
	}
}
