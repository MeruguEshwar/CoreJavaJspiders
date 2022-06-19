
 class student 
{
		private String name,res;
		private int rn,sub1,sub2,tot;
		private double avg;
			public void setstudent(String n,int r,int s1,int s2)
			{
				name=n;
				rn=r;
				sub1=s1;
				sub2=s2;
			}
			public void calculate()
			{
				tot=sub1+sub2;
				avg=tot/2.0;
				if(sub1>=35 && sub2>=35)
					res="PASS";
				else
					res="FAIL";
					
			}
			public void printstudent()
			{
				System.out.print("\n name="+name+"\n rn="+rn+"\n sub1="+sub1+"\n sub2="+sub2+"\n tot="+tot+"\n avg="+avg +"\n res="+res);
			}

}
	class ammulu
	{
		public static void main(String argv[])
		{
			student obj=new student();
			obj.setstudent("nani",1432,90,95);
			obj.calculate();
			obj.printstudent();
		}
	}
