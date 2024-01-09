package bullscows;

public record Turn(String input, String secret) {

    public Integer bulls() {
        int bulls = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (input.length() - 1 < i) {
                break;
            }

            if (input.charAt(i) == secret.charAt(i)) {
                bulls++;
            }
        }

        return bulls;
    }

    public Integer cows() {
        int cows = 0;

        for (int i = 0; i < secret.length(); i++) {
            if (input.charAt(i) != secret.charAt(i)) {
                if (input.contains(String.valueOf(secret.charAt(i)))) {
                    cows++;
                }
            }
        }

        return cows;
    }

    public boolean match() {
        return bulls() == secret.length();
    }

    public void print() {
        System.out.print("Grade: ");

        if ((bulls() + cows()) == 0) {
            System.out.print("None.");
        } else if (cows() == 0) {
            System.out.print(bulls() + " bull(s).");
        } else if (bulls() == 0) {
            System.out.print(cows() + " cow(s).");
        } else {
            System.out.print(bulls() + " bull(s) and " + cows() + " cow(s).");
        }

        System.out.println();
    }
}
