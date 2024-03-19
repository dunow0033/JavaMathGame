import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Helpers {
	
	static Scanner sc = new Scanner(System.in);
	static List<Game> gameHistory = new ArrayList<Game>();
	
	static void AddToHistory(int gameScore, GameType gameType)
	{
		
		Game game = new Game();
		game.setScore(gameScore);
		game.setType(gameType);
		game.setDate(LocalDateTime.now());
		
		gameHistory.add(game);
	}
	
	static void PrintGames(String name)
	{

		if (gameHistory.size() > 0)
		{
			System.out.println("Games History");
			System.out.println("--------------------");
			for(Game game : gameHistory)
			{

				System.out.println(game.getDate() + " - " + game.getType() + ": " + game.getScore() + " points");
			}
			System.out.println("--------------------\n");
			System.out.println("Press Enter key to return to main menu");
			sc.nextLine();
		}
		else
		{
			System.out.println("Sorry " + name + ", you have no game history yet.");
			System.out.println();
			System.out.println("Press Enter key to return to main menu");
			sc.nextLine();
		}
	}
	
	static int[] GetDivisionNumbers()
	{
		Random number = new Random();
		
		int[] numbers = new int[2];
		
		do
		{
			numbers[0] = number.nextInt(20);
			numbers[1] = number.nextInt(20);
		}
		while(numbers[0] % numbers[1] != 0);
		
		return numbers;
	}
	
	static String validateNumber(String number)
	{
		while(number == null || !number.matches("-?\\d+"))
		{
			System.out.println();
			System.out.println("Invalid input.  Please enter only integers ('q' to quit):  ");
			number = sc.next();
			
			if(number.trim().equalsIgnoreCase("q"))
			{
				return number.trim().toLowerCase();
			}
		}
		
		return number;
	}
	
	static String GetName()
	{
		System.out.println("Hello, what is your name?");
		String name = sc.nextLine();
		
		while(!name.matches("^[a-zA-Z]+$"))
		{
			System.out.println("Sorry, name should only be letters.  Please try again:  ");
			name = sc.nextLine();
		}
		
		while(name == null || name.isBlank())
		{
			System.out.println("Sorry, name must not be empty!!  Please try again!!");
			name = sc.nextLine();
		}
		
		name = Character.toUpperCase(name.charAt(0)) + name.substring(1).toLowerCase();
		
		return name;
	}
}
