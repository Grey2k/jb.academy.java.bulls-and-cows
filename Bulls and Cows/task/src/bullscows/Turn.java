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

        StringBuilder message = new StringBuilder();

        if ((bulls() + cows()) == 0) {
            message.append("None.");
        } else if (cows() == 0) {
            message.append(bulls()).append(" ").append(bulls() > 1 ? "bulls" : "bull");
        } else if (bulls() == 0) {
            message.append(cows()).append(" ").append(cows() > 1 ? "cows" : "cow");
        } else {
            message
                    .append(bulls()).append(" ").append(bulls() > 1 ? "bulls" : "bull")
                    .append(" and ")
                    .append(cows()).append(" ").append(cows() > 1 ? "cows" : "cow");
        }

        System.out.println(message);
    }
}
