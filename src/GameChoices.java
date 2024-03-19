import java.util.Random;
import java.util.Scanner;

public class GameChoices {
	
	private static int number1;
	private static int number2;
	private static int score;
	private static String answer;
	private static GameType gameType = null;
	private static Scanner sc = new Scanner(System.in);
	
	public static void AdditionGame(String name)
	{
		score = 0;
		
		while(true)
		{
			Random random = new Random();
			
			int number1 = random.nextInt(20);
			int number2 = random.nextInt(20);
			
			gameType = GameType.Addition;
			
			System.out.println();
			System.out.println(number1 + " + " + number2);
			System.out.println("Answer ('q' to quit):  ");
			answer = sc.next();
			
			if(answer.trim().equalsIgnoreCase("q"))
			{
				QuitGame(name);
				break;
			}
			
			String result = Helpers.validateNumber(answer);
			
			if(result.trim().equalsIgnoreCase("q"))
			{
				QuitGame(name);
				break;
			}
			
			if(Integer.parseInt(result) == (number1 + number2))
			{
				score++;
				System.out.println("Great, you got it right!!");
				System.out.println();
				System.out.println("Press Enter key to continue...");
				sc.nextLine();
				sc.nextLine();
			}
			else
			{
				System.out.println("Sorry, better luck next time!!");
				System.out.println();
				System.out.println("Press Enter key to continue...");
				sc.nextLine();
				sc.nextLine();
			}
		}
	}
	
	public static void SubtractionGame(String name)
	{
		score = 0;
		
		while(true)
		{
			Random random = new Random();
			number1 = random.nextInt(20);
			number2 = random.nextInt(20);
			
			gameType = GameType.Subtraction;
			
			System.out.println();
			System.out.println();
			System.out.println(number1 + " - " + number2);
			System.out.println("Answer ('q' to quit):  ");
			
			answer = sc.next();
			
			if(answer.trim().equalsIgnoreCase("q"))
			{
				QuitGame(name);
				break;
			}
			
			String result = Helpers.validateNumber(answer);
			
			if(result.trim().equalsIgnoreCase("q"))
			{
				QuitGame(name);
				break;
			}
			
			if(Integer.parseInt(result) == (number1 - number2))
			{
				score++;
				System.out.println("Great, you got it right!!");
				System.out.println();
				System.out.println("Press Enter key to continue...");
				sc.nextLine();
				sc.nextLine();
			}
			else
			{
				System.out.println("Sorry, better luck next time!!");
				System.out.println();
				System.out.println("Press Enter key to continue...");
				sc.nextLine();
				sc.nextLine();
			}
		}
	}
	
	public static void MultiplicationGame(String name)
	{
		score = 0;
		
		while(true)
		{
			Random random = new Random();
			int number1 = random.nextInt(20);
			int number2 = random.nextInt(20);
			
			gameType = GameType.Multiplication;
			
			System.out.println();
			System.out.println();
			System.out.println(number1 + " * " + number2);
			System.out.println("Answer ('q' to quit):  ");
			answer = sc.next();
			
			if (answer.trim().equalsIgnoreCase("q"))
			{
				QuitGame(name);
				break;
			}

			String result = Helpers.validateNumber(answer);

			if (result.trim().equalsIgnoreCase("q"))
			{
				QuitGame(name);
				break;
			}
			
			if (Integer.parseInt(result) == (number1 * number2))
			{
				score++;
				System.out.println("Great, you got it right!!");
				System.out.println();
				System.out.println("Press Enter key to continue...");
				sc.nextLine();
				sc.nextLine();
			}
			else
			{
				System.out.println("Sorry, better luck next time!!");
				System.out.println();
				System.out.println("Press Enter key to continue...");
				sc.nextLine();
				sc.nextLine();
			}
		}
	}
	
	public static void DivisionGame(String name)
	{
		score = 0;
		
		while(true)
		{
			int[] divisionNumbers = Helpers.GetDivisionNumbers();
			
			int number1 = divisionNumbers[0];
			int number2 = divisionNumbers[1];
			
			gameType = GameType.Division;
			
			System.out.println();
			System.out.println();
			
			System.out.println(number1 + " / " + number2);
			
			System.out.println("Answer ('q' to quit):  ");
			answer = sc.next();
			
			if(answer.trim().equalsIgnoreCase("q"))
			{
				QuitGame(name);
				break;
			}
			
			String result = Helpers.validateNumber(answer);
			
			if(result.trim().equalsIgnoreCase("q"))
			{
				QuitGame(name);
				break;
			}
			if(Integer.parseInt(result) == (number1 / number2))
			{
				score++;
				System.out.println("Great, you got it right!!");
				System.out.println();
				System.out.println("Press Enter key to continue...");
				sc.nextLine();
				sc.nextLine();
			}
			else
			{
				System.out.println("Sorry, better luck next time!!");
				System.out.println();
				System.out.println("Press Enter key to continue...");
				sc.nextLine();
				sc.nextLine();
			}
		}
	}
	
	public static void QuitGame(String name)
	{
		Helpers.AddToHistory(score, gameType);
		System.out.println();
		System.out.println("Thank you!!  Bye!!");
	}
}
