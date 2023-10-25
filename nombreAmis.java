import java.util.Scanner;

public class nombreAmis {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       int number1 = 0;
       int number2 = 0;

       System.out.println("Enter two numbers to verify their friendship \n");

        do{
            System.out.print("Enter first number: ");
            number1 = sc.nextInt();
        } while( number1 <= 0 );

        do{
            System.out.print("Enter second number: ");
            number2 = sc.nextInt();
        } while( number2 <= 0 );

        if(sontAmis(number1, number2)){
            System.out.println("These numbers is friend");
        } else {
            System.out.println("These numbers isn't friend");
        }
        sc.close();
    }

    public static boolean sontAmis(int a, int b){
        if (sommeDivieursStricts(a) == b && sommeDivieursStricts(b) == a) {
            return true;
        }
        return false;
    }

    public static int sommeDivieursStricts(int n){
        int somme = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                somme += i;
            }
        }
        return somme;
    }


}
