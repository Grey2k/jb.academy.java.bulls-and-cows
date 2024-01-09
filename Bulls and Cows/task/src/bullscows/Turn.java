package bullscows;

public record Turn(Integer input, Integer secret) {

    public Integer bulls() {
        int bulls = 0;
        for (int i = 0; i < secret.toString().length(); i++) {
            if (input.toString().charAt(i) == secret.toString().charAt(i)) {
                bulls++;
            }
        }

        return bulls;
    }

    public Integer cows() {
        int cows = 0;

        for (int i = 0; i < secret.toString().length(); i++) {
            if (input.toString().charAt(i) != secret.toString().charAt(i)) {
                if (input.toString().contains(String.valueOf(secret.toString().charAt(i)))) {
                    cows++;
                }
            }
        }

        return cows;
    }

    public boolean match() {
        return bulls() == secret.toString().length();
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

        System.out.print(" The secret code is " + secret.toString() + ".");
        System.out.println();
    }
}
