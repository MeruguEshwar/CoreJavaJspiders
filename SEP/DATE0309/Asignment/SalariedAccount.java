class SalariedAccount extends Account
{
	String companyName;
	SalariedAccount(int Accno,String AccHolderName,double Bal,String companyName) 
	{
		super(Accno,AccHolderName,Bal);
		this.companyName=companyName;
	}

	public void displayAccountDetails()
	{
		System.out.println("*************This is SalariedAccount*************");
		details();
		System.out.println("companyName is:"+companyName);
	}
}
