import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        int qty = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        System.out.println(
                (10 <= qty && qty <= 20 && !isWeekend) || (15 <= qty && qty <= 25 && isWeekend)
        );
    }
}