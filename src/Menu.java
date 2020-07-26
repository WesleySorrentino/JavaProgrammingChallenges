import challenges.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private Scanner s = new Scanner(System.in);
    private HeadsTails headsTails = new HeadsTails("Heads/Tails");
    private HigherLower higherLower = new HigherLower("Higher/Lower");
    private RockPaperScissors rockPaperScissors = new RockPaperScissors("Rock/Paper/Scissors");
    private ArrayList<Challenge> challenges = new ArrayList<Challenge>();

    public void startScreen() {
        System.out.println("Welcome to Java Code Challenges!");
        System.out.println("Please enter your name: ");
        String userName = s.nextLine();
        System.out.println("Hello " + userName + "!");
        selection(userName);
    }

    private void printGames() {
        challenges.add(headsTails);
        challenges.add(higherLower);
        challenges.add(rockPaperScissors);

        for (int i = 0; i <challenges.size() ; i++) {
            System.out.println((i+1) + ": " + challenges.get(i).getName());
        }
    }

    private void selection(String userName) {
        printGames();
        System.out.println("Type a number: ");
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
        }
    }
}
