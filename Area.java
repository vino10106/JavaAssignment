import java.util.*;

public class Area {
    static void area(float a) {
        System.out.println("area of square = "+ (a * a));
    }
    static void area(float l, float b) {
        System.out.println("area of rectangle = "+ (l * b));
    }
    static void area(Double r) {
        System.out.println("area of circle = " + (3.14 * r * r));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of square");
        float a=sc.nextFloat();
        area(a);
        System.out.println("enter length and  breadth of the rectangle");
        float l=sc.nextFloat();
        float b=sc.nextFloat();
        area(l,b);
        System.out.println("enter the radius of a circle");
        Double radius=sc.nextDouble();
        area(radius);
    }
}
