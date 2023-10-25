import java.util.Scanner;

public class compteArebours {
    public static void main(String[] args){
        System.out.print("Enter a number please: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();        
        displayNumber(input);
        sc.close();
    }

    public static void displayNumber(int n){
        if(n<=0){
            System.out.println(0);
        }else{
            System.out.println(n);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
            }
            displayNumber(n-1);
        }
    }
}