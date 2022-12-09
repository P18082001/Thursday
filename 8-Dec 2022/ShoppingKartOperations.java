package shoppingKartusingarray;
import java.util.Scanner;
public class ShoppingKartOperations {
	static Scanner sc=new Scanner(System.in);
	
	static void AllMenus()
	{
		
		System.out.println("\t\t~~ Welcome To Shopping Kart~~");
	
	while(true)
	{
		System.out.println("====================================");
		System.out.println("press 1.for AdminPanle\n"
				+"press 2 .for User panel\n"
				+"press 3.for quite");
		
		System.out.println("=======================================");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
	
		switch(choice)
		{
		case 1: AdminPanel.adminOperation();
		System.out.println("==========================================");
		break;
		
		case 2: UserPanel.UserOperation();
		System.out.println("==========================================");
		break;
		
		case 3:System.exit(0);
		}
	}
	
		
	}
}