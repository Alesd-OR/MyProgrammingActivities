//Read 2 values with a decimal place (x and y), which should represent the coordinates 
//from a point in a plane. Next, determine which quadrant the 
//point, or if it is on one of the Cartesian axes or at the origin (x = y = 0).
//If the point is at the source, type the message "Source."
//If the point is on one of the axes type "X-Axis" or "Y-Axis" as shown in 
//situation.

import java.util.Locale;
import java.util.Scanner;

public class axis {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ao = new Scanner(System.in);

        System.out.println("Write the axis X value: ");
        double x = ao.nextDouble();
        System.out.println("Write the axis Y value: ");
        double y = ao.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origin");
        } else if (x == 0.0) {
            System.out.println("Axis Y");
        } else if (y == 0.0) {
            System.out.println("Axis X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Your axis is on the Quadrant 1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Your axis is on the Quadrant 2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Your axis is on the Quadrant 3");
        } else {
            System.out.println("Your axis is on the Quadrant 4");
        }

        ao.close();
    }
}
