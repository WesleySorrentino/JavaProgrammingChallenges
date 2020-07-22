package challenges;

import java.util.Scanner;

public class Challenge {
    private String name;
    private Scanner s = new Scanner(System.in);

    public Challenge(String name) {
        this.name = name;
    }

    protected int randomizer(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + 1;
    }

    protected boolean playAgain() {
        System.out.println("Would you lke to try again? y/n: ");
        String choice = s.nextLine();

        switch (choice.toLowerCase()) {
            case "y":
                return true;
            case "n":
                return false;
        }

        return false;
    }

    public String getName() {
        return name;
    }
}
