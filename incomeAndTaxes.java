//In an imaginary country called Lisarb, all the inhabitants are happy to pay their taxes because they know 
//that there are no corrupt politicians in it and the funds raised are used for the benefit of the population, without 
//any deviation. The currency of this country is the Rombus, whose symbol is R$.
//Read a value with two decimal places, equivalent to the salary of a person from Lisarb. Then calculate and 
//show the amount that this person should pay in Income Tax, according to the table below.
//Remember that if the salary is R$ 3002.00, the fee that is 8% only about R$ 1000.00, because the range of 
//salary that is from R$ 0.00 to R$ 2000.00 is exempt from Income Tax.
//In the example provided (below), the rate is 
//of 8% over R$ 1000.00 + 18% over R$ 2.00, which results in R$ 80.36 in total. The value must be printed with 
//two decimal places.

import java.util.Locale;
import java.util.Scanner;

public class incomeAndTaxes {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner oli = new Scanner(System.in);

        System.out.println("Write the value of your mensal salary: ");
        double salary = oli.nextDouble();
      
        double tax;

        if (salary <= 2000.0) {
            tax = 0.0;
        } else if (salary <= 3000.0) {
            tax = (salary - 2000.0) * 0.08;
        } else if (salary <= 4500.0) {
            tax = (salary - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            tax = (salary - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (tax == 0.0) {
            System.out.println("Your salary is exempt of the income tax");
        } else {
            System.out.printf("Your salary has R$ %.2f%n income tax", tax);
        }

        oli.close();
    }
}
