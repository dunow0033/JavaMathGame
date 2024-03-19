
import java.time.LocalDate;
import java.util.Scanner;

public class Menu {
    private String answer;
    private int number1;
    private int number2;
    private int score = 0;

    public void showMenu(String name) {
        Scanner scanner = new Scanner(System.in);
        boolean isGameOn = true;
        
        while (isGameOn) {
            System.out.println("------------------------------");
//            System.out.println("Hello " + name + ". It's " + LocalDate.now() + ". It's your math game!!\n");
            System.out.println("Hello " + name +". It's " + LocalDate.now() + ". It's your math game!!\n");
            System.out.println("Press Enter to show menu");
            scanner.nextLine();

            System.out.println("Please choose a subject:");
            System.out.println("V - View Previous Games");
            System.out.println("A - Addition");
            System.out.println("S - Subtraction");
            System.out.println("M - Multiplication");
            System.out.println("D - Division");
            System.out.println("Q - Quit the program");

            String choice = scanner.next().toUpperCase();
            switch (choice) {
                case "V":
                    // View Previous Games logic
                    break;
                case "A":
                    // Addition logic
                    break;
                case "S":
                    // Subtraction logic
                    break;
                case "M":
                    // Multiplication logic
                    break;
                case "D":
                    // Division logic
                    break;
                case "Q":
                	System.out.println("Goodbye");
                    isGameOn = false;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        scanner.close();
