package challenges;

import java.util.Scanner;

public class HigherLower extends Challenge {
    private Scanner s = new Scanner(System.in);

    public HigherLower(String name) {
        super(name);
    }

    public void start(String userName) {
        System.out.println("Welcome to Higher or Lower " + userName + "!");
//      Ask's user for input.
        do {
            System.out.println("Type a number to select your difficulty: ");
            difficultySelection();

        } while (playAgain());
    }

    private void difficultySelection() {
//      Display's different difficulty settings.
        System.out.println("1. Easy: 1-10\n2. Medium: 1-25\n3. Hard: 1-50\n4. Custom Difficulty\n");
//      Ask's for user's input for selection
        System.out.println("Enter a number for your selection: ");
        int choice = s.nextInt();
        s.nextLine();
//      Different difficulty settings.
        int easy = randomizer(1,10);
        int medium = randomizer(1,25);
        int hard = randomizer(1,50);

        boolean isSelecting = true;
        while (isSelecting) {

            switch (choice) {
                case 1:
                    game(easy,5);
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
//      Ask's user for how they want to play the game.
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
//  Game Logic
    private void game(int difficulty, int numberOfGuesses) {
        int guesses = 0;
        int guessesLeft = numberOfGuesses;

        while (guesses != numberOfGuesses) {
//          Display's how many guesses the user has left.
            System.out.println("You have " + guessesLeft-- + " tries..\n");
//          Ask's for input
            System.out.println("Type a number within the difficulty range: ");
            int guess = s.nextInt();
            s.nextLine();
//          Checks if number is equal to the difficulty number.
            if (guess == difficulty) {
                System.out.println("You win! The number was: " + difficulty +
                        "\nYou got it in " + guesses + " guesses!");
            } else if (guess > difficulty) {
                guesses++;
                System.out.println("Your guess is higher! Try again...\n");
            } else {
                guesses++;
                System.out.println("Your guess is lower! Try again...\n");
            }
        }
        System.out.println("You loose! The number was " + difficulty);
    }
}