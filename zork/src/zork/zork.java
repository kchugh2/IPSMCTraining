package zork;
import java.util.Scanner;

public class zork
{
	public static int foyer ()
	{
		Scanner keyboard = new Scanner(System.in);
		int choice, option=0, breaker=0;
		
		do
			{
			System.out.println("You are in the Foyer\nYou see a dead scorpion\n - Press 1 to Exit Press 2 to enter the Front Room");
			choice = keyboard.nextInt();
			
				if (choice == 1)
					{ option = 0; breaker = 1;}
				else if (choice == 2)
					{ option = 2; breaker = 1;}
				else
					{ System.out.println("Invalid entry play again"); breaker = 0;}
			} while (breaker == 0);
		
	
			
		
		
		
		return option;
	}
	
	public static int frontroom ()
	{
		Scanner keyboard = new Scanner(System.in);
		int choice, option=0, breaker=0;
		
		do
			{
			System.out.println("You are in the Front Room\nYou see a Piano\n - Press 1 to go South Press 2 to go East or Press 3 to go West");
			choice = keyboard.nextInt();
			
				if (choice == 1)
					{ option = 1; breaker = 1;}
				else if (choice == 2)
					{ option = 4; breaker = 1;}
				else if (choice == 3)
					{ option = 3; breaker = 1;}
				else
					{ System.out.println("Invalid entry play again"); breaker = 0;}
			} while (breaker == 0);
		
	
			
		
		
		
		return option;
	}
	
	public static int library ()
	{
		Scanner keyboard = new Scanner(System.in);
		int choice, option=0, breaker=0;
		
		do
			{
			System.out.println("You are in the Library\nYou see multiple spiders\n - Press 1 to go East Press 2 to go North");
			choice = keyboard.nextInt();
			
				if (choice == 1)
					{ option = 2; breaker = 1;}
				else if (choice == 2)
					{ option = 5; breaker = 1;}
				else
					{ System.out.println("Invalid entry play again"); breaker = 0;}
			} while (breaker == 0);
		
	
			
		
		
		
		return option;
	}
	public static int kitchen ()
	{
		Scanner keyboard = new Scanner(System.in);
		int choice, option=0, breaker=0;
		
		do
			{
			System.out.println("You are in the Kitchen\nBats are flying at you\n - Press 1 to go West Press 2 to go North");
			choice = keyboard.nextInt();
			
				if (choice == 1)
					{ option = 2; breaker = 1;}
				else if (choice == 2)
					{ option = 7; breaker = 1;}
				else
					{ System.out.println("Invalid entry play again"); breaker = 0;}
			} while (breaker == 0);
		
	
			
		
		
		
		return option;
	}
	
	public static int dining()
	{
		Scanner keyboard = new Scanner(System.in);
		int choice, option=0, breaker=0;
		
		do
			{
			System.out.println("You are in the Dining Room\n You see dust and some empty boxes\n - Press 1 to go south - there are no other exits");
			choice = keyboard.nextInt();
			
				if (choice == 1)
					{ option = 3; breaker = 1;}
				/*else if (choice == 2)
					{ option = 5; breaker = 1;}*/
				else
					{ System.out.println("Invalid entry play again"); breaker = 0;}
			} while (breaker == 0);
		
	
			
		
		
		
		return option;
	}
	public static int vault ()
	{
		Scanner keyboard = new Scanner(System.in);
		int choice, option=0, breaker=0;
		
		do
			{
			System.out.println("You are in the Vault\nYou see some scary skeleton men\n - Press 1 to go East -There are no other exits ");
			choice = keyboard.nextInt();
			
				if (choice == 1)
					{ option = 7; breaker = 1;}
				/*else if (choice == 2)
					{ option = 5; breaker = 1;}*/
				else
					{ System.out.println("Invalid entry play again"); breaker = 0;}
			} while (breaker == 0);
		
		
			
		
		
		
		return option;
	}
	
	
	public static int parlour ()
	{
		Scanner keyboard = new Scanner(System.in);
		int choice, option=0, breaker=0;
		
		do
			{
			
			System.out.println("You are in the parlour\nYou have FOUND THE TREASURE CHEST!! You win! \n - Press 1 to go West Press 2 to go South");
			choice = keyboard.nextInt();
			
				if (choice == 1)
					{ option = 6; breaker = 1;}
				else if (choice == 2)
					{ option = 4; breaker = 1;}
				else
					{ System.out.println("Invalid entry play again"); breaker = 0;}
			
			} while (breaker == 0);
		
	
			
		
		
		
		return option;
	}
	
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int playerentry = 1, score = 0;
		
		do 
			{
				switch(playerentry)
				{
				
				case 1:
				playerentry = foyer();
				break;
				
				case 2:
				playerentry = frontroom();
				break;
				
				case 3:
				playerentry = library();
				break;
				
				case 4:
				playerentry = kitchen();
				break;
				
				case 5:
				playerentry = dining();
				break;
				
				case 6:
				playerentry = vault();
				break;
				
				case 7:
				playerentry = parlour();
				score++;
				break;
			
				}
			} while (playerentry !=0);
		System.out.println("Thank You for Playing");
		System.out.println("You found the treasure " + score + " Times");
		
		
	}











	}

	 

