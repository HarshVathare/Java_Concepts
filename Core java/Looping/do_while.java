package Looping;

import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String ch = in.nextLine();
        //int choose = 2;
        switch (ch.toLowerCase()){
            case "a":
                System.out.print("choose is 1");
                break;
            case "b":
                System.out.print("choose is 2");
                break;
            case "c":
                System.out.print("choose is 3");
                break;
            default:
                System.out.print("choose is unvalid");
                break;
        }
    }
}
