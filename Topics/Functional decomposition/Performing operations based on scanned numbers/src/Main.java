import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        double secondNum = scanner.nextDouble();
        double result;

        if (firstNum == 1 || firstNum == 2) {
            result = Math.pow(secondNum, firstNum + 1);
            System.out.println(result);
        } else if (firstNum == 3) {
            result = 1 / secondNum;
            System.out.println(result);
        }
    }
}
