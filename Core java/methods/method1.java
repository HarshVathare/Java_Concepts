package methods;

public class method1 {
    public static void main(String[] args) {
       loop(1,10);
        System.out.println("******************");
        loop(11,20);
        System.out.println("******************");
        loop(-10,0);
    }

    public static void loop(int start,int stop){
        for(int i = start; i <= stop; i++){
            System.out.println(i);
        }
    }
}
