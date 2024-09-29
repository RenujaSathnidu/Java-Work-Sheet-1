import java.util.*;

public class Two {
    public static void main(String[] args){
        Scanner name = new Scanner(System.in);
        System.out.print("Enter the first word of the name:");
        String first = name.nextLine();

        System.out.print("Enter the middle word of the name:");
        String middle = name.nextLine();

        System.out.print("Enter the last word of the name:");
        String last = name.nextLine();

        char li = last.charAt(0);

        System.out.println("The name you entered is: " + last +", "+ middle + " " + li );

        name.close();

    }
}
