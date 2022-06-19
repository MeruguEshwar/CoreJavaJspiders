import java.util.Scanner;
class str2
{
	public static void main(String argv[])
	{
		Scanner scan=new Scanner(System.in);

		System.out.print("Enter string name....:");
		String s1=scan.next();

		System.out.print("enter index num....:");
		int index=scan.nextInt();

		char res=s1.charAt(index);
		System.out.print("character prescent in the string is "+index+" is "+res);
	}
}