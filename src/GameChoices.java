import java.util.Random;
import java.util.Scanner;

public class GameChoices {
	
	private static int number1;
	private static int number2;
	private static int score;
	private static String answer;
	private static Scanner sc = new Scanner(System.in);
	
	public static void AdditionGame(String name)
	{
		score = 0;
		
		while(true)
		{
			Random random = new Random();
			
			int number1 = random.nextInt(20);
			int number2 = random.nextInt(20);
			
			System.out.println();
			System.out.println(number1 + " + " + number2);
			System.out.println("Answer ('q' to quit):  ");
			answer = sc.next();
			
			if(answer.trim().equalsIgnoreCase("q"))
			{
				quitGame(name);
				break;
			}
			
			if(answer.trim().equalsIgnoreCase("q"))
			{
				QuitGame(name);
				break;
			}
			
			if(Integer.parseInt(answer) == (number1 + number2))
			{
				score++;
				System.out.println("Great, you got it right!!");
				System.out.println();
				System.out.println("Press any key to continue...");
				sc.nextLine();
			}
			else
			{
				System.out.println("Sorry, better luck next time!!");
				System.out.println();
				System.out.println("Press any key to continue...");
				sc.nextLine();
			}
		}
	}

}
