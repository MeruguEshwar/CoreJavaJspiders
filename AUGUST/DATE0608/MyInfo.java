import java.util.Scanner;
class MyInfo
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter your name:....");
		String name=scan.next();

		System.out.println("Enter your age:....");
		int age=scan.nextInt();

		System.out.println("Enter your height:....");
		double height=scan.nextDouble();

		
		System.out.println("Enter your character:........");
		char Lastletter=scan.next().charAt(0);

		System.out.println("My info is:....");
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("height:"+height);
		System.out.println("Lastletter:"+Lastletter);
	}
}
