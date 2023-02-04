import java.util.Scanner;

public class daysOfWeek {
    public static void main(String[] args) {

        Scanner oli = new Scanner(System.in);

        System.out.println("Write a number from 1 to 7: ");
        int number = oli.nextInt();
        // char number;

        switch (number) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
            case 7:
                System.out.println("Saturday");
            default:
                System.out.println("Invalid value!");
        }
        oli.close();
    }
}
