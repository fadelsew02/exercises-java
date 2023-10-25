import java.util.Scanner;

public class nombrePremier {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       int number = 0;

        do{
            System.out.print("Enter a number: ");
            number = sc.nextInt();
        } while( number <= 0 );

        if(estPremier(number)){
            System.out.println("C'est un nombre premier");
        } else {
            System.out.println("Ce n'est pas un nombre premier");
        }
        sc.close();
    }

    public static boolean estPremier(int n){

        if( n == 1 ){
            return false;
        } else {
            int countDiviseurs = 0;
            for (int index = 1; index < Math.sqrt(n); index++) {
                if(n % index == 0){
                    countDiviseurs++;
                }
            }

            if (countDiviseurs == 1) {
                return true;
            }
        }
        return false;
    }
}
