package challenges;

public class Challenge {
    private String name;

    public Challenge(String name) {
        this.name = name;
    }

    protected int randomizer(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + 1;
    }

    public String getName() {
        return name;
    }
}
