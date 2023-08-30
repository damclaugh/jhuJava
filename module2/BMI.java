package module2;

import java.util.Scanner;

/*
This program takes input from the user about their height and weight
and calculates their BMI score
*/

public class BMI {
    public static void main(String[] args) {

        System.out.println("The following program calculates a person's "
                + "Body Mass Index (BMI)");

        // get height and weight from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        float weightPounds = input.nextInt();
        System.out.print("Enter height in inches: ");
        float heightInches = input.nextInt();

        // convert weight to kilograms and height to meters and
        // calculate BMI
        double poundToKilos = 0.45359237;
        float inchToMeters = 0.0254F;
        double weightKilos = weightPounds * poundToKilos;
        float heightMeters = heightInches * inchToMeters;
        double bmi = weightKilos / (heightMeters * heightMeters);

        // display BMI
        System.out.println("BMI is: " + bmi);

        // display BMI categories
        System.out.println("The Department of Health & Human Services "
                + "and the National Institutes of Health\ncategorize BMI scores "
                + "based on the following metrics:");
        System.out.println("\tUnderweight: less than 18.5");
        System.out.println("\tNormal: 18.5 - 24.9");
        System.out.println("\tOverweight: 25 - 29.9");
        System.out.println("\tObese: 30 or greater");  
    } // end main method
} // end BMI class
