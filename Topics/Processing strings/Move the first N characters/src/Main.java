import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        StringBuilder result = new StringBuilder();
        StringBuilder prefix = new StringBuilder();
        int length = scanner.nextInt();

        if (length >= input.length()) {
            result = new StringBuilder(input);
        } else {
            for (int i = 0; i < input.length(); i++) {
                if (i < length) {
                    prefix.append(input.charAt(i));
                } else {
                    result.append(input.charAt(i));
                }
            }

            result.append(prefix);
        }

        System.out.println(result);
    }
}
