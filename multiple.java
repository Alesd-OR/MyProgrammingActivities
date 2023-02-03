//Read 2 integer values (A and B). After, the program should show a message "It is multiple" or "Are not 
//multiples", indicating whether the read values are multiple of each other. Please note: the numbers must be able to be entered in 
//ascending or descending order.

import java.util.Scanner;

public class multiple {
    public static void main(String[] args) {

        int number;
        int number2;

        Scanner oli = new Scanner(System.in);

        System.out.println("Write a number to discover if it is a multiple of each other or not: ");
        number = oli.nextInt();

        System.out.println("Write another one: ");
        number2 = oli.nextInt();

        if (number % number2 == 0 || number2 % number == 0) {
            System.out.println("The numbers are multiple!");
        } else {
            System.out.println("The numbers are not multiple!");
        }
        oli.close();
    }
}
