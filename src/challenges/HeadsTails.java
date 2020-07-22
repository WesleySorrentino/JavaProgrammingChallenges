package challenges;

import java.util.Scanner;

public class HeadsTails extends Challenge {
    private Scanner s = new Scanner(System.in);

    public HeadsTails(String name) {
        super(name);
    }

    public void start(String userName) {
        System.out.println("Welcome to Heads/Tails " + userName + "!");
        do {
            System.out.println("Type a number to select your choice: ");
            displayOptions();

        } while (playAgain());
    }

    private void displayOptions() {
        //Ask's player for input
        System.out.println("Type 1 or 2: ");
        int choice = s.nextInt();
        s.nextLine();

        switch (choice) {
            case 1:
                System.out.println("You chose Heads!");
                break;
            case 2:
                System.out.println("You chose Tails!");
                break;
        }

        coinFlip();
    }

    private void coinFlip() {
        //Randomizes number between 1 & 2 then depending on the value it outputs the value.
        int randomNum = randomizer(1,2);

        switch (randomNum) {
            case 1:
                System.out.println("It's Heads!");
                break;
            case 2:
                System.out.println("It's Tails!");
                break;
        }
    }
}
