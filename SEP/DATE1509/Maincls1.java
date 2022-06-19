class Maincls1
{
	public static void main(String argv[])
	{
		produceNoise(new Lion());
		produceNoise(new Dog());
	}

	public static void produceNoise(Animal a)
	{
		a.noise();
	}

}