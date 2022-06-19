import java.util.Scanner;
class str1 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=scan.next();
		int res=s1.length();
		System.out.println("length of the string is" + res);
	}
}
