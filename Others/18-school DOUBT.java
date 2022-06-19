class school 
{
	private string name;
	private int rn;
	private static nstudents=0;

	public void setstudent(string name,string rn)
	{
	  this.name=name;
	  this.rn=rn;
	  nstudents ++;
	}
	
	public void printstudent()
  	{
     	  System.out.print("\n name="+name +"rn="+rn);
  	}
	
	public void schoolstrength()
   	{
     	System.out.print("\n no of students="+nstudents);
  	}
}


class static2
{
	public static void main(String argv[])
	{
		school s1=new school();
		school s2=new school();
		school s3=new school();

		s1.setstudent("Raju",1);
		s2.setstudent("sai",5);
		s1.setstudent("laxman",8);

		s1.printstudent();
		s2.printstudent();
		s3.printstudent();
		s4.printstudent();
       }
}
		