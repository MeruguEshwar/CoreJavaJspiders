class nest
{
	public static void main(String argv[])
	{
	   int a=0,b=0,c=0;
	   try
	   {
		a=Integer.parseInt(argv[0]);
		c=a/b;
		System.out.print("\n div="+c);
	   }
		catch(ArthematicExpression e1)
		{
		    System.out.print("\n error:"+e1);
		}
	  	catch(NumberFormatException e2)
		{
		    System.out.print("\n error:"+e2);
		}
		catch(ArrayIndexOutOfBound e3)
		{
		    System.out.print("\n error:"+e3);
		}
	   System.out.print("\n program terminated");
	}
}

 