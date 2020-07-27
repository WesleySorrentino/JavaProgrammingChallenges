import challenges.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private Scanner s = new Scanner(System.in);
    private HeadsTails headsTails = new HeadsTails("Heads/Tails");
    private HigherLower higherLower = new HigherLower("Higher/Lower");
    private RockPaperScissors rockPaperScissors = new RockPaperScissors("Rock/Paper/Scissors");
    private ArrayList<Challenge> challenges = new ArrayList<>();

    public void startScreen() {
        System.out.println("Welcome to Java Code Challenges!");
        System.out.println("Please enter your name: ");
        String userName = s.nextLine();
        System.out.println("Hello " + userName + "!\n");
        selection(userName);
    }

    private void printGames() {
        for (int i = 0; i <=2 ; i++) {
            System.out.println((i+1) + ": " + challenges.get(i).getName());
        }
    }

    private void selection(String userName) {
        challenges.add(headsTails);
        challenges.add(higherLower);
        challenges.add(rockPaperScissors);

        while (true) {
            printGames();
            System.out.println("Type a number or type 9 to quit: ");
            int choice = s.nextInt();
            s.nextLine();
            switch (choice) {
                case 1:
                    headsTails.start(userName);
                    break;
                case 2:
                    higherLower.start(userName);
                    break;
                case 3:
                    rockPaperScissors.start(userName);
                    break;
                case 9:
                    System.out.println("Exiting application...");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Please enter a valid number\n");
            }
        }
    }
}
