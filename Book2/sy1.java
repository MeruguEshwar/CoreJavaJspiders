class sy
{
	public static void main(String argv[])
	{
		try
		{
			int ch;
			System.out.print("\n enter char:");
			ch=System.in.read();
			System.out.print("\n ch="+ch +"char="+(char)ch);
			
		}
		catch(Exception e)
		{
			System.out.print("\n error:"+e);
		}
	}

}
