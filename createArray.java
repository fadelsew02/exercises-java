
public class createArray {
    public static void main(String[] args){
        int array[];

        array = reverseArray(fullMyArray());
        displayArray(array);
    }

    public static int[] fullMyArray(){
        int myArray[] = new int[20];

        for(int i = 0; i<20; i++){
            myArray[i] = i+1;
        }
        return myArray;
    }

    public static int[] reverseArray(int[] array){
        int reversedArray[] = new int[array.length];

        for(int i = 0; i < array.length; i++){
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

    public static void displayArray(int[] array){
        System.out.print("[ ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println(']');
    }
}








  


