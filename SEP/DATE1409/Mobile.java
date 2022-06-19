class Mobile 
{
	String brandName;
	double cameraPixel;

	Battery b = new Battery(2600,4.3);
	SimCard s = new SimCard("Airtel","micro","4g","+919900300600");

	Mobile(String brandName,double cameraPixel)
	{
		this.brandName = brandName;
		this.cameraPixel = cameraPixel;
	}
	public void call()
	{
		s.supportsCalling();
		b.discharge();
	}
	public void message()
	{
		s.supportsTextong();
		b.discharge();
	}
	
}
