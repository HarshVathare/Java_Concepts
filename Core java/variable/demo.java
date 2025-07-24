package variable;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr no : ");
        int n1 = sc.nextInt();

        System.out.println("Enetr no : ");
        int n2 = sc.nextInt();
        //System.out.println("hello world..!");
        demo d = new demo();
        //create the add method
        int res = d.addition(n1, n2);
        System.out.println("Answer is : " + res);

        swapp(n1, n2);
    }

    public static void swapp(int no1, int no2) {
        int temp;
        temp = no1;
        no1 = no2;
        no2 = temp;

        System.out.println("Answer is no1 : " + no1);
        System.out.println("Answer is no2 : " + no2);
    }

    public int addition(int num1, int num2) {
        return num1 + num2;
    }
}
