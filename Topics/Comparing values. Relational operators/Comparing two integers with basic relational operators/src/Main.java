import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read the first integer
        int a = scanner.nextInt();

        // read the second integer
        int b = scanner.nextInt();

        // Perform the comparison of a and b

        // compare if value of a is more than b
        if (a > b) {
            System.out.println("Greater");
        }

        // compare if value of a is less than b
        if (a < b) {
            System.out.println("Less");
        }

        // compare if value of a equals b
        if (a == b) {
            System.out.println("Equal");
        }
    }
}