// Import the Scanner class from the java.util package to take user input
import java.util.Scanner;

// This is the name of the class (blueprint). The file name must match the class name.
public class Main {

    // This is the main method — the starting point of every Java program.
    // 'public' means it can be accessed from anywhere.
    // 'static' means it belongs to the class (no object creation needed).
    // 'void' means it doesn't return anything.
    // 'String[] args' is used to take command-line arguments (optional for now).
    public static void main(String[] args) {

        // Create a Scanner object named 'sc' to take input from the keyboard (System.in)
        Scanner sc = new Scanner(System.in);

        // Print a message asking the user to enter a number
        // 'print' does not move to the next line (unlike println)
        System.out.print("Enter a number : ");

        // Read an integer value from the user and store it in variable 'num'
        int num = sc.nextInt();

        // Print the value entered by the user to the console
        // System: built-in Java class
        // out: object that sends output to the console
        // println: method that prints the value and moves to the next line
        System.out.println("Number : " + num);
    } // End of main method

} // End of Main class
