import java.util.Scanner;

public class nombreParfait {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number = 0;
        do{
            System.out.print("Enter a number: ");
            number = sc.nextInt();
        } while( number <= 0 );
        
        if(sommeDivisors(number) == number){
            System.out.println("This number is perfect.");
        } else {
            System.out.println("This number isn't perfect");
        }
        sc.close();
    }

    public static int sommeDivisors(int number){
        int somme = 0;
        for(int i=1; i<number; i++){
            if(number % i == 0){
                somme += i;
            }
        }
        return somme;
    }
}
