package methods;

public class call_method_return {
    public static void main(String[] args) {
        System.out.print("area of rectanle is : " + area(4563764, 5673));
    }

    public static double area(int height, int weight) {
        return height * weight;
    }

    public static int area(int side) {
        return side * side;
    }

    public static float area(float height, float weight) {
        return height * weight;
    }

    public static double area(double x, double y) {
        return x * y;
    }

    public static double area(int x, float y) {
        return x * y;
    }

    public static double area(float x, int y) {
        return x * y;
    }
}
