package Looping;

import java.util.Scanner;

public class problems {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }

        for (int i = n; i >= 1; i--){
            for( int j = 1; j <= i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
