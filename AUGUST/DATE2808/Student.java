class  Student
{
	static String javatrainername="sunil";
	static String javabatchcode="TECM17";
	String name;
	double tenth;
	double inter;
	double degree;
	double masters;

	Student(String name,double tenth,double inter,double degree,double masters)
	{
		this.name=name;
		this.tenth=tenth;
		this.inter=inter;
		this.degree=degree;
		this.masters=masters;
	}

	Student(String name,double tenth,double inter,double degree)
    {
		this.name=name;
		this.tenth=tenth;
		this.inter=inter;
		this.degree=degree;
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
		Student s1=new Student("sathvik" ,83.0,87.3,60.2,65.6);
		Student s2=new Student("kethineni", 85.0,90.2,64.3);
		s1.displaystdinfo();
		s2.displaystdinfo();
	}
}