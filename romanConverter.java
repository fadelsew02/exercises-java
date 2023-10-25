import java.util.Scanner;

public class romanConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        System.out.println(convertToRoman(number));

        sc.close();

    }


    public static String convertToRoman(int num){
        int[] arabicNums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNums = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String result = "";

        for (int i = 0; i < arabicNums.length; i++) {
            while (num >= arabicNums[i]) {
                result += romanNums[i];
                num -= arabicNums[i];
            }
        }
        return result;
    }
}
