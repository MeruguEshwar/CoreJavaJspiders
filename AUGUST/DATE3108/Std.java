class  Std
{
	static String javatrainername="sunil";
	static String javabatchcode="TECM17";
	String name;
	double tenth;
	double inter;
	double degree;
	double masters;

	Std(String name,double tenth,double inter,double degree)
    {
		this.name=name;
		this.tenth=tenth;
		this.inter=inter;
		this.degree=degree;
	}

	Std(String name,double tenth,double inter,double degree,double masters)
	{
		this(name,tenth,inter,degree);
		this.masters=masters;
	}

	

	public void displaystdinfo()
	{
		System.out.println("current undergoing java training by Mr."+javatrainername+" and:beongs to javabatchcode:"+javabatchcode);
		System.out.println("Student name: "+name);
		System.out.println("Student tenth: "+tenth);
		System.out.println("Student inter: "+inter);
		System.out.println("Student degree: "+degree);
		if(masters !=0.0)
		{
			System.out.println("student masters: "+masters);
		}
	}

	public static void main(String[] args) 
	{
		Std s1=new Std("kethineni", 85.0,90.2,64.3);
		Std s2=new Std("sathvik" ,83.0,87.3,60.2,65.6);
		
		s1.displaystdinfo();
		s2.displaystdinfo();
	}
}