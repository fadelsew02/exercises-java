import java.util.Scanner;

public class cesarCipher {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String myString = "";

        System.out.print("Enter a string: ");
        myString = sc.nextLine();

        System.out.println(rot13(myString));

        sc.close();
    }

    public static String rot13(String str){
        String decodedStr = "";

        for (int i = 0; i < str.length(); i++) {
            int charCode = str.codePointAt(i);
        
            if (charCode >= 65 && charCode <= 90) { 
              int shiftedCharCode = charCode + 13;
        
              if (shiftedCharCode > 90) {
                shiftedCharCode -= 26;
              }
        
              decodedStr += (char)shiftedCharCode;
            } else {
              decodedStr += str.charAt(i);
            }
          }
        
          return decodedStr;
    }
    
}
