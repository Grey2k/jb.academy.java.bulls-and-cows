package bullscows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please, enter the secret code's length:");
        Game game = new Game(new Scanner(System.in).nextInt());
        game.run();
    }
}
