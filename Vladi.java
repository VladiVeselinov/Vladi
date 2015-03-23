import java.util.Scanner;
public class Vladi 
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Vladi version 0.0.1");
		Scanner keyboard = new Scanner(System.in);
		String com = "";
		boolean exit = false;
		while(!exit)
		{
			System.out.print(">");
			com = keyboard.next();
			switch(com.toUpperCase())
			{
			case "ECHO":
				String str = keyboard.nextLine();
				System.out.println(str);
				break;
			case "EXIT":
				exit = true;
				break;
			default:
				System.out.println(com +" is not a recognized command.");
			}
		}
		keyboard.close();
		System.out.println("Thank you for using Vladi!");
		System.exit(0);
	}
}
