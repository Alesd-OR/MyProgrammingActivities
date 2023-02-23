//Write a Java program that reads the width and height values ​​of a rectangle.  
//Then show on the screen the value of its area, perimeter and diagonal.  
//Using a class.

import java.util.Scanner;

public class rectangle {

    private double width;
    private double height;

    public rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getDiagonal() {
        return Math.sqrt(width * width + height * height);
    }

    public static void main(String[] args) {
        Scanner oli = new Scanner(System.in);

        System.out.print("Write the width of the rectangle: ");
        double width = oli.nextDouble();

        System.out.print("Write the height of the rectangle: ");
        double height = oli.nextDouble();

        Rectangle rectangle = new Rectangle (width, height);

        System.out.println("Rectangle area: " + retangule.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle diagonal: " + rectangle.getDiagonal());

        oli.close();
    }
}
