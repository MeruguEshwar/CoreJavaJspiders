class Battery 
{
	Integer Capacity;
	double  chargeVoltage;
	Battery(Integer Capacity,double chargeVoltage)
	{
		this.Capacity = Capacity;
		this.chargeVoltage = chargeVoltage;
	}
	public void givesPower()
	{
		System.out.println("gives Power");
	}
	public void storesPower()
	{
		System.out.println("Stores the power");
	}
	public void discharge()
	{
		System.out.println("discharge the battery....");
	}
}
