package module1;

/*
* This program prints "Java" where each letter is displayed using the character 
* of that letter. It uses Java's escape sequences and spaces to line up the 
* letters on four lines. It prints each line using Java's System.out.println 
* method.
*/

public class Main {
    public static void main(String[] args) {

        System.out.println("\t\b\b\b\bJ\t A\t\b\bV\t\t\b\b\b\bV\tA");
        System.out.println("\t\b\b\b\bJ\tA A\t\bV\t\b\b\b\b\bV\t\bA A");
        System.out.println(
                "J\t\b\b\b\bJ\t\bAAAAA\tV\t\b\b\b\b\b\bV\t\b\bAAAAA");
        System.out.println(
                " J J\t\b\bA\t\t\b\b\b\bA\t V\t\b\b\bA\t\t\b\b\b\b\bA");
        // end main method
    }
} // end Main class
