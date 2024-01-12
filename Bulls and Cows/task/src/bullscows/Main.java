package bullscows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the length of the secret code:");
        Integer secretCodeLength = scanner.nextInt();

        System.out.println("Input the number of possible symbols in the code:");
        Integer numberOfSymbols = scanner.nextInt();

        Game game = new Game(secretCodeLength, numberOfSymbols);
        game.run();
    }
}
