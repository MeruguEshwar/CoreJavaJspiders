class divi1
{
	public static void main(String argv[])
	{
	  int a=0,b=0,c=0;
	  try
	   {
		a=Integer.parseInt(argv[0]);
		b=Integer.parseInt(argv[1]);
		c=a/b;
		System.out.print("\n div="+c);
	   }
		catch(Exception e1)
		{
		    System.out.print("\n error:"+e1);
		}
	  	
	   System.out.print("\n program terminated...");
	}
}

 