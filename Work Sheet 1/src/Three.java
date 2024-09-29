import java.util.*;

public class Three {
    public static void main(String[] args){
        Scanner cm = new Scanner(System.in);
        System.out.print("Enter the length in centimeters:");
        float centi = cm.nextFloat();

        float inches = centi / 2.54f;
        int feet = (int) (inches / 12);
        float mod = inches % 12;

        System.out.println(feet + " feet and " + String.format("%.2f",inches) + " inches");

        cm.close();
    }
}
