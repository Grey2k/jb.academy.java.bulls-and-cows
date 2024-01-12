import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            result.append(String.valueOf(c).repeat(2));
        }

        System.out.println(result);
    }
}
