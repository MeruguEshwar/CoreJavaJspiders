class Maincls
{
	public static void main(String argv[])
	{
		lionNoise(new Lion());
		dogNoise(new Dog());
	}

	public static void lionNoise(Lion l)
	{
		l.noise();
	}

	public static void dogNoise(Dog d)
	{
		d.noise();
	}
}