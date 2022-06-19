class cfile1
{
	public static void main(String argv[])
	{
		cfile1 f=new cfile1("C:\\Program Files (x86)\\Java\\jdk1.6.0_01\\bin\\apt.java");
		System.out.print("\n FileName="+f.getName());
		System.out.print("\n parent="+f.getParent());
	}
}