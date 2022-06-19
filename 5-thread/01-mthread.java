class mthread
{
public static void main(String argv[])
{
	System.out.print("\n main thread started...");
	Thread t=Thread.currentThread();
	System.out.print("\n main thread="+t);
	System.out.print("\n T.name="+t.getPriority());
	t.setName("apex");
	t.setPriority(8);
	System.out.print("\n after change....mthread="+t);
	try
	{
		for(int i=1;i<=5;i++)
		{
			System.out.print("\n m.thread:"+i);
			Thread.sleep(2000);
		}
	}
	catch(InterruptedException e){System.out.print("\n error:"+e);}
	System.out.print("\n m.threadterminating....");
	}
}