package Array;
import java.util.Scanner;

public class simple_arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //initializing the array..!
        System.out.print("Enter array size : ");
        int size = in.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter array : ");


        //taking the input
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }

        //print the output
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }


    }
}
