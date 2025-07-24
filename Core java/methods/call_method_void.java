package methods;

public class call_method_void {
    public static void main(String[] args) {
        int i = 0;
        sum(45, 5673);
        sum(45.43f, 5673.43f);
        sum(45.43f, 567);
        sum(45, 567.43f);
        sum(4545654344345.32d, 567.43f);
    }

    public static void sum(int ignoredHeight, int ignoredWeight) {
        System.out.println("Addition is 2 into ");
    }

    public static void sum(float ignoredHeight, float ignoredWeight) {
        System.out.println("Addition is 2 floats ");
    }

    public static void sum(float ignoredHeight, int ignoredWeight) {
        System.out.println("Addition is 1 float & 2 int ");
    }

    public static void sum(int ignoredHeight, float ignoredWeight) {
        System.out.println("Addition is 1 int & 2 float ");
    }

    public static void sum(double ignoredHeight, double ignoredWeight) {
        System.out.println("Addition is 1 double & 2 float ");
    }
}
