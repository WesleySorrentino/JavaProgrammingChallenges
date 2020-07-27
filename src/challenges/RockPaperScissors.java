package challenges;

import java.util.*;

public class RockPaperScissors extends Challenge{
    private final Scanner s = new Scanner(System.in);
    private final Map<String,String> win = new HashMap<>();

    public RockPaperScissors(String name) {
        super(name);
    }
//  Start menu of game
    public void start(String userName) {
        System.out.println("Welcome to Rock/Paper/Scissors " + userName + "!\n");
        do {
            howToPlay();
            game();
        } while (playAgain());
    }
//  Starts the game
    private void game() {
//      Ask's for user input
        System.out.println("Type a move: ");
        String playerMove = s.nextLine();
//      Capitalizes first letter in input
        String cap = playerMove.substring(0,1).toUpperCase() + playerMove.substring(1);
        String cpu = cpuMove();

        checkWin(cap,"Scissors");
    }
//  Displays the different ways the user can win
    private void howToPlay() {
        System.out.println("How to play:\n" +
                "\nRock beats scissors\n" +
                "Scissors beats paper\n" +
                "Paper beats rock\n");
    }
//  Generates cpu's move and returns it
    private String cpuMove() {
        String[] moves = {"Rock", "Paper", "Scissors"};
        var rand = new Random();
        int move = rand.nextInt(moves.length);

        return moves[move];
    }
//  Checks to see if the user wins or cpu
    private void checkWin(String player, String cpu) {
//      Different win situations - Left beats Right
        win.put("Rock","Scissors");
        win.put("Scissors","Paper");
        win.put("Paper","Rock");
//      Iterates over the win statements
        for (Map.Entry<String,String> entry : win.entrySet()){
            if (player.equals(entry.getKey()) && cpu.equals(entry.getValue())) {
                System.out.println("Player wins! Cpu chose: " + cpu);
                break;
            } else if (cpu.equals(entry.getKey()) && player.equals(entry.getValue())) {
                System.out.println("Player loses! Cpu chose: " + cpu);
                break;
            } else if (player.equals(cpu)) {
                System.out.println("It's a draw! Player chose: " + player + " Cpu chose: " + cpu);
                break;
            }
        }
    }
}