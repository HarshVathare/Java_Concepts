package Looping;

public class sum_of_digit {
    public static void main(String[] args) {
        int x = 6556;
        int sumOfDigit=0;
        while (true){
            sumOfDigit = sumOfDigit + (x%10);

            x = x/10;
            if(x < 1){
                break;
            }

        }
        System.out.print("sum of the digit is : "+sumOfDigit);
    }
}
