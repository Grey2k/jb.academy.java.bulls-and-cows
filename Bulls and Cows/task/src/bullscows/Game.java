package bullscows;

public class Game {

    private Integer secret;

    public Game(Integer secret) {
        this.secret = secret;
        this.init(secret);
    }

    private void init(Integer secret) {
        System.out.println("The secret code is prepared: ****");
    }

    public void setSecret(Integer secret) {
        this.secret = secret;
    }

    public Turn turn(Integer guess) {
        return new Turn(guess, secret);
    }

    public void run() {
        System.out.println();
        System.out.println("Turn 1. Answer:");
        System.out.println("1234");
        System.out.println("Grade: 1 cow.");
        //
        System.out.println();
        System.out.println("Turn 2. Answer:");
        System.out.println("5678");
        System.out.println("Grade: 1 cow.");
        //
        System.out.println();
        System.out.println("Turn 3. Answer:");
        System.out.println("9012");
        System.out.println("Grade: 1 cow.");
        //
        System.out.println();
        System.out.println("Turn 4. Answer:");
        System.out.println("9087");
        System.out.println("Grade: 1 cow.");
        //
        System.out.println();
        System.out.println("Turn 5. Answer:");
        System.out.println("1087");
        System.out.println("Grade: 1 cow.");
        //
        System.out.println();
        System.out.println("Turn 6. Answer:");
        System.out.println("9205");
        System.out.println("Grade: 1 cow.");
        //
        System.out.println();
        System.out.println("Turn 7. Answer:");
        System.out.println("9305");
        System.out.println("Grade: 4 bulls.");

        System.out.println("Congrats! The secret code is 9305.");
    }
}
