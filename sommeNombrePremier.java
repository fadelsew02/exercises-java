import java.util.Scanner;

public class sommeNombrePremier {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       int number = 0;
       int sum = 0;
       int counter = 0;
       int i = 2;

        do{
            System.out.print("Enter a number: ");
            number = sc.nextInt();
        } while( number <= 0 );

        while (true) {
            if(estPremier(i)){
                System.out.println(i);
                sum += i;
                counter++;
            }
            if(counter == number){
                break;
            }
            i++;
        } 

        System.out.println("La somme est: " + sum);

        sc.close();
    }

    public static boolean estPremier(int n){

        int countDiviseurs = 0;
        for (int index = 1; index < Math.sqrt(n); index++) {
            if(n % index == 0){
                countDiviseurs++;
            }
        }

        if (countDiviseurs == 1) {
            return true;
        }
        return false;
    }
}
