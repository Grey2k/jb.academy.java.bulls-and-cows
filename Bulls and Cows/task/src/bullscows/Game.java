package bullscows;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private static Integer ASCII_LETTERS_BEGIN = 97;

    private static final Integer MAX_LENGTH = 36;
    private static final Integer MAX_LENGTH_DIGITS = 10;

    private String secret;


    public Game(Integer length, Integer numberOfSymbols) {
        this.init(length, numberOfSymbols);
    }

    private void init(Integer length, Integer numberOfSymbols) {
        try {
            this.secret = generateSecret(length, numberOfSymbols);
            System.out.println("Okay, let's start a game!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private String generateSecret(Integer length, Integer symbols) {
        if (length > MAX_LENGTH) {
            throw new IllegalArgumentException("Error: can't generate a secret number with a length of " + MAX_LENGTH +
                    " because there aren't enough unique digits.");
        }

        if (symbols > MAX_LENGTH) {
            throw new IllegalArgumentException("Error: can't generate a secret number with a number of symbols " + symbols +
                    " because there aren't enough unique symbols.");
        }

        StringBuilder secretString = new StringBuilder();

        while (secretString.length() < length) {
            char digit = String.valueOf(new Random().nextInt(0, symbols)).charAt(0);
            char c = digit;

            // length is greater than 10, so we need try to generate a letter additionally to the digit
            if (symbols > MAX_LENGTH_DIGITS) {
                char letter = (char) (new Random().nextInt(ASCII_LETTERS_BEGIN, ASCII_LETTERS_BEGIN + (symbols - MAX_LENGTH_DIGITS - 1)));
                c = (new Random().nextBoolean() ? digit : letter);
            }

            // exclude leading zeroes
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

        StringBuilder message = new StringBuilder();
        message
                .append("The secret is prepared: ")
                .append("*".repeat(length))
                .append(" (");

        message.append("0")
                .append("-")
                .append(symbols > MAX_LENGTH_DIGITS ? MAX_LENGTH_DIGITS - 1 : symbols - 1);

        if (symbols > MAX_LENGTH_DIGITS) {
            message.append(", ")
                    .append((char) ((int) ASCII_LETTERS_BEGIN))
                    .append("-")
                    .append((char) (ASCII_LETTERS_BEGIN + (symbols - MAX_LENGTH_DIGITS - 1)))
                    .append(").");
        }

        System.out.println(message);

        return secretString.toString();
    }

    public void run() {
        int turns = 1;

        while (true) {
            System.out.println("Turn " + turns + ":");
            Turn turn = new Turn((new Scanner(System.in)).next(), secret);
            turn.print();

            if (turn.match()) {
                System.out.println("Congratulations! You guessed the secret code.");
                break;
            }

            turns++;
        }
    }
}
