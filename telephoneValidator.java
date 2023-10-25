import java.util.Scanner;
import java.util.regex.*;

public class TelephoneValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a phone number: ");
        String phoneString = sc.nextLine();

        System.out.println(telephoneCheck(phoneString));
        sc.close();
    }

    public static boolean telephoneCheck(String phoneNumber) {
        String phoneRegex = "^(1\\s?)?(\\(\\d{3}\\)|\\d{3})([\\s\\-])?\\d{3}([\\s\\-])\\d{4}$";

        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(phoneNumber);

        return matcher.matches();
    }
}
