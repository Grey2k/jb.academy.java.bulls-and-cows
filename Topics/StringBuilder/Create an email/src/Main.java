import java.util.Scanner;

class EmployeeManagement {

    private static final String EMAIL_DOMAIN = "@work.net";

    @SuppressWarnings("StringBufferReplaceableByString")
    public static String createEmail(String name, String surname) {
        StringBuilder sb = new StringBuilder();

        sb.append(name).append(surname).append(EMAIL_DOMAIN);

        return sb.toString();
    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String surname = scanner.next();

        String completeEmail = createEmail(name, surname);

        System.out.println(completeEmail);
    }
}