//Read an integer, and then tell if this number is negative or not.

import java.util.Scanner;

public class formOfNumber {
    public static void main(String[] args) {

        int number;

        Scanner oli = new Scanner(System.in);

        System.out.println("Write a number to discover if the number is positive, negative ou neutral: ");
        number = oli.nextInt();

        if (number > 0) {
            System.out.println("It is positive");
        } else if (number < 0) {
            System.out.println("It is negative");
        } else {
            System.out.println("It is neutral");
        }
        oli.close();
    }
}
