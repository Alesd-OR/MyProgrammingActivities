//Read an integer, and then tell if this number is odd or even.

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {

        int number;
        Scanner oli = new Scanner(System.in);

        System.out.println("Write a number to discover if it is odd or even: ");
        number = oli.nextInt();

        if (number % 2 == 0) {
            System.out.println("It is even.");
        } else {
            System.out.println("It is odd.");
        }
        oli.close();
    }
}
