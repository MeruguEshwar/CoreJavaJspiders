class Saucer 
{
	String shape;
	
	CoffeeCup cc = new Coffeecup("ceramic","white",120);

	CoffeeBean cb1 = new CoffeeBean();
	CoffeeBean cb2 = new CoffeeBean();
	CoffeeBean cb3 = new CoffeeBean();
	CoffeeBean cb4 = new CoffeeBean();
	CoffeeBean cb5 = new CoffeeBean();

	Saucer(String shape)
	{
		this.shape = shape;
	}

	public void hold( ) 
	{
		System.out.println(" ");
	}
}
