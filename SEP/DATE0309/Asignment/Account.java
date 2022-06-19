class Account 
{
	int Accno;
	String AccHolderName;
	double Bal;
	

	Account(int Accno,String AccHolderName,double Bal) 
	{
		this.Accno = Accno;
		this.AccHolderName = AccHolderName;
		this.Bal = Bal;
	}
	public void details()
	{
		System.out.println("Accno is:"+Accno);
		System.out.println("AccHolderName:"+AccHolderName);
		System.out.println("Bal:"+Bal);
	}
}
