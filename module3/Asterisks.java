package module_3;

import java.util.Scanner;

public class Asterisks {
  
    public static void main(String[] args){

        // get user input for maximum number of asterisks 
        // and choice of triangle shape
        Scanner input = new Scanner(System.in);
        System.out.print("This program displays a right triangle using "
            + "asterisks.\nEnter maximum number of asterisks to display on "
            + "a line: ");
        int numAsterisks = input.nextInt();
        System.out.print("Enter 1 to show a triangle where the maximum " 
            + "line length is at the bottom of the triangle.\nEnter 2 to "
            + "show the maximum line length at the top of the triangle.\n"
            + "Choice: ");
        int choice = input.nextInt();
        
        // display triangle according to user choice using switch statement
        switch(choice){
            case 1:
                for (int i = 0; i < numAsterisks; i++){
                    for (int j = 0; j <= i; j++){
                        System.out.print('*');
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = numAsterisks; i > 0; i--){
                    for (int j = 0; j < i; j++){
                        System.out.print('*');
                    }
                    System.out.println();
                }
        }
    } // end main method
} // end Asterisks class
