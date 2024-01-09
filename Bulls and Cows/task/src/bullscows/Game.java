package bullscows;

import java.util.Scanner;

public class Game {

    private static final Integer MAX_LENGTH = 10;

    private Integer secret;

    public Game(Integer length) {
        this.init(length);
    }

    private void init(Integer length) {
        try {
            this.secret = generateSecret(length);
            System.out.println("Okay, let's start a game!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private Integer generateSecret(Integer length) {
        if (length > MAX_LENGTH) {
            throw new IllegalArgumentException("Error: can't generate a secret number with a length of " + MAX_LENGTH +
                    " because there aren't enough unique digits.");
        }

        StringBuilder secretString = new StringBuilder();

        while (secretString.length() < length) {
            String pseudoRandom = String.valueOf(System.nanoTime());

            for (char c : new StringBuilder(pseudoRandom).reverse().toString().toCharArray()) {
                // check for leading zeros
                if (secretString.isEmpty() && c == '0') {
                    continue;
                }

                // exclude duplicates
                if (secretString.toString().contains(String.valueOf(c))) {
                    continue;
                }

                secretString.append(c);

                if (secretString.length() == length) {
                    break;
                }
            }
        }

        return Integer.parseInt(secretString.toString());
    }

    public void run() {
        int turns = 1;

        while (true) {
            System.out.println("Turn " + turns + ":");
            Turn turn = new Turn((new Scanner(System.in)).next(), secret.toString());
            turn.print();

            if (turn.match()) {
                System.out.println("Congratulations! You guessed the secret code.");
                break;
            }
        }
    }
}
