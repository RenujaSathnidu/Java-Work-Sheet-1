import java.util.*;

public class Circle {

    final double PI = 3.14;

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return PI * radius * radius;
    }

    public double computeCircumference() {
        return 2 * PI * radius;
    }


    public static void main(String[] args){

        Scanner radius = new Scanner(System.in);

        System.out.print("Enter the outer circle radius:");
        double ro = radius.nextDouble();

        System.out.print("Enter the inner circle radius:");
        double ri = radius.nextDouble();

        Circle inner = new Circle(ri);
        Circle outer = new Circle(ro);

        double shadedArea = outer.computeArea() - inner.computeArea();

        double cri = inner.computeCircumference();
        double cro = outer.computeCircumference();


        System.out.println(" ");

        System.out.println("Area of the shaded region: " + String.format("%.2f",shadedArea));
        System.out.println("Circumference of the inner circle: " + String.format("%.2f",cri));
        System.out.println("Circumference of the outer circle: " + String.format("%.2f",cro));


    }
}
