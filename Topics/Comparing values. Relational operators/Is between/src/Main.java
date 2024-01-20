import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        int from = Math.min(second, third);
        int to = Math.max(second, third);

        System.out.println(from <= first && first <= to);
    }
}