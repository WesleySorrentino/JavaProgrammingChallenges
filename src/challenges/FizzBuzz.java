package challenges;

public class FizzBuzz extends Challenge {

    public FizzBuzz(String name) {
        super(name);
    }

    public void start(String userName) {
        System.out.println("Welcome to FizzBuzz " + userName + "!");
        fizzBuzz();
    }

    private void fizzBuzz() {
        for (int i = 1; i <= 101; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}