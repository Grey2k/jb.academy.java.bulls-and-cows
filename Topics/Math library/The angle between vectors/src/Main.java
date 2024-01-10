import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vector1 = new int[]{scanner.nextInt(), scanner.nextInt()};
        int[] vector2 = new int[]{scanner.nextInt(), scanner.nextInt()};

        double mod1 = Math.sqrt(Math.pow(vector1[0], 2) + Math.pow(vector1[1], 2));
        double mod2 = Math.sqrt(Math.pow(vector2[0], 2) + Math.pow(vector2[1], 2));
        double magnitude = vector1[0] * vector2[0] + vector1[1] * vector2[1];

        System.out.println(Math.round(Math.toDegrees(Math.acos(magnitude / (mod1 * mod2)))));
    }
}
