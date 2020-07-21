package challenges;

import java.util.Scanner;

public class HigherLower extends Challenge {
    private Scanner s = new Scanner(System.in);

    public HigherLower(String name) {
        super(name);
    }

    public void start(String userName) {
        System.out.println("Welcome to Higher or Lower " + userName + "!");
        System.out.println("Type a number to select your difficulty: ");
        difficultySelection();
    }

    private void difficultySelection() {
        System.out.println("1. Easy: 1-10\n2. Medium: 1-25\n3. Hard: 1-50\n4. Custom Difficulty\n");
        System.out.println("Enter a number for your selection: ");
        int choice = s.nextInt();
        s.nextLine();

        int easy = randomizer(1,10);
        int medium = randomizer(1,25);
        int hard = randomizer(1,50);

        boolean isSelecting = true;
        while (isSelecting) {

            switch (choice) {
                case 1:
                    game(easy,15);
                    break;
                case 2:
                    game(medium,10);
                    break;
                case 3:
                    game(hard,5);
                    break;
                case 4:
                    customDifficulty();
                    break;
            }
            isSelecting = false;
        }
    }

    private void customDifficulty() {
        System.out.println("Type a min value: ");
        int min = s.nextInt();
        s.nextLine();

        System.out.println("Type a max value: ");
        int max = s.nextInt();
        s.nextLine();

        System.out.println("Type the amount of guesses you want: ");
        int numberOfGuesses = s.nextInt();
        s.nextLine();

        int customDifficulty = randomizer(min,max);
        game(customDifficulty,numberOfGuesses);
    }

    private void game(int difficulty, int numberOfGuesses) {
        int guesses = 0;

        while (guesses != numberOfGuesses) {
            System.out.println("Type a number within the difficulty range: ");
            int guess = s.nextInt();
            s.nextLine();

            if (guess == difficulty) {
                System.out.println("You win! The number was: " + difficulty + "\nYou got it in " + guesses + " guesses!");
                break;
            } else if (guess < difficulty) {
                guesses++;
                System.out.println("Your guess is lower!\n");
            } else if (guess > difficulty) {
                guesses++;
                System.out.println("Your guess is higher!\n");
            } else {
                System.out.println("You loose! The number was " + difficulty);
            }
        }
    }
}