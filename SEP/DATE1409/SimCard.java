class SimCard 
{
	String brandName;
	String chipSize;
	String simType;
	String simNumber;
	SimCard(String brandName,String chipSize,String simType,String simNumber)
	{
			this.brandName = brandName;
			this.chipSize = chipSize;
			this.simType = simType;
			this.simNumber = simNumber; 
	}
	public void supportsCalling()
	{
		System.out.println("while calling......");
	}
	public void supportsTextong()
	{
		System.out.println("while  texting .....");
	}
}
