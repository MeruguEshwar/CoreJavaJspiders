class Student 
{
	String name;
	double tenth;
	double inter;
	double degree;
	double masters;
	static String javatrainer = "Sunil";
	static String javabatchcode = "Sunil";

	Student(String name,double tenth,double inter,double degree,double masters)
	{
		this.name = name;
		this.tenth = tenth;
		this.inter =  inter;
		this.degree = degree;
		this.masters = masters;
	}

	Student(String name,double tenth,double inter,double degree)
	{
		this.name = name;
		this.tenth = tenth;
		this.inter =  inter;
		this.degree = degree;
	}

	public void diplaystdInfo()
	{
		System.out.println("name is "+name);
		System.out.println("tenth marks is "+tenth);
		System.out.println("inter marks is "+inter);
		System.out.println("degree marks is "+degree);
		if(masters != 0.0)
		{
			System.out.println("master marks is "+masters);
		}
	}

	public static void main(String[] args) 
	{
		Student s1 = new Student("Nani",9.5,95.6,75.2,68.0);

		Student s2 = new Student("chint",9.2,93.1,74.1);
		s1.diplaystdInfo();
		System.out.println("***************This is the masters program*****************");
		s2.diplaystdInfo();
	}
}
