//Make a program to read a student's name and the three grades he got in the three quarters of the year (first quarter is worth 30 and the second and third are worth 35 each). 
//At the end, show the student's final grade in the year.
//Also tell if the student is approved (PASS) or not (FAILED) and, if not, how many points are left for the student to get the minimum to pass (which is 60% of the grade).
//You must create a class called "Student" to resolve this issue.

import java.util.Scanner;

class Student {

    private String name;
    private double grade1, grade2, grade3;

    public Student(String name, double grade1, double grade2, double grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public double calculateFinalGrade() {
        double finalGrade = grade1 * 0.3 + grade2 * 0.35 + grade3 * 0.35;
        return finalGrade;
    }

    public boolean isApproved() {
        double finalGrade = calculateFinalGrade();
        return finalGrade >= 6.0;
    }

    public double pointsToPass() {
        double finalGrade = calculateFinalGrade();
        double pointsToPass = 6.0 - finalGrade;
        return pointsToPass;
    }

    public void displayResult() {
        double finalGrade = calculateFinalGrade();
        if (isApproved()) {
            System.out.println(name + " passed the year with a final grade of " + finalGrade);
        } else {
            double pointsToPass = pointsToPass();
            System.out.println(name + " failed the year with a final grade of " + finalGrade);
            System.out.println(name + " needs " + pointsToPass + " points to pass the year.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
       
        Scanner oli = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = oli.nextLine();

        System.out.print("Enter grade for first quarter (out of 30): ");
        double grade1 = oli.nextDouble();

        System.out.print("Enter grade for second quarter (out of 35): ");
        double grade2 = oli.nextDouble();

        System.out.print("Enter grade for third quarter (out of 35): ");
        double grade3 = oli.nextDouble();

        Student student = new Student(name, grade1, grade2, grade3);
        student.displayResult();

        oli.close();
    }
}
