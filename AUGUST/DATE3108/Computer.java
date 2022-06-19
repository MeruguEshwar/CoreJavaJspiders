class Computer 
{
	Computer()
	{
		System.out.println("Con of computer class.");
	}
	void Computer_method()
	{
		System.out.println("Power gone ! shut down PC soon...");
	}
}
class Laptop()
{
	Laptop()
	{
		System.out.println("Con of Laptop class.");
	}
	void Laptop_method()
	{
		System.out.println("99% Battery available...");
	}
}
public static void main(String[] args) 
{
		Computer my = new Computer();
		Laptop your = new Laptop();

		my.Computer_method();
		your.Laptop_method();
}




		
	

