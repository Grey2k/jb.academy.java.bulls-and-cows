package bullscows;

import java.util.Scanner;

public class Game {

    private Integer secret;

    public Game(Integer secret) {
        this.init(secret);
    }

    private void init(Integer secret) {
        this.secret = secret;
        // System.out.println("The secret code is prepared: ****");
    }

    public void run() {
        Turn turn = new Turn((new Scanner(System.in)).nextInt(), secret);

        turn.print();
    }
}
