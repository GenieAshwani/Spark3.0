import java.util.Scanner;
class UserInputDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First name: ");
		String fname=sc.next();

		System.out.print("Enter last name: ");
		String lname=sc.next();

		String fullName=fname+lname;
		System.out.print(fullName);
	}
}
