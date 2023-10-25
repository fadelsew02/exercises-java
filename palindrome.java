import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String myString = "";

        System.out.print("Enter a string: ");
        myString = sc.nextLine();

        System.out.println(estPalindrome(myString));

        sc.close();

    }


    public static boolean estPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        return cleanedStr.equals(reversedStr);
    }
}

