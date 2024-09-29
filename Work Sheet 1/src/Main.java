//(1)

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner middle = new Scanner(System.in);
        String word;
        System.out.print("Enter the word:");
        word = middle.nextLine();
        System.out.println("Word you entered is: " + word);


        if (word.length() % 2 == 0){
            System.out.println("Please enter a word, characters length with odd number.");
        } else {
            int mi = word.length() / 2;
            char mc = word.charAt(mi);
            System.out.println("Middle character is: "+ mc);
        }

        middle.close();
    }
}

