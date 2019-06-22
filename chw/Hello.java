import java.util.Scanner; // method for getting keyboard input
import java.util.Random; // Random number generator

/**
 * Test program.
 */

public class Hello {
    
    public static void main(String[] args) {
        // Generate some simple output
        System.out.println("Hello World!");
        
        // Declare some variables
        String message;
        int x, y;
        
        // Declare a literal (constant)
        final double PI;  // final => this is a constant and can't be reassigned after initialisation
        
        // Assign values to the variables we just declared
        x = 10;
        y = 20;
        message = "Ring me when you get home.";
        PI = 3.14159; // PI cannot now be reassigned as it is a constant
        
        // Declare and initialise a variable in one line
        int hour = 3;
        
        // Print without a carriage retur;
        System.out.print("The hour is ");
        System.out.print(hour);
        System.out.println(" o'clock.");
        
        // Integer division always rounds down
        System.out.print("Integer division: 3/2 = ");
        System.out.println(hour / 2);
        
        // Demonstrate floating point division and printf with format string
        System.out.printf("Floating point division: pi/2 = %.3f\n", PI / 2);
        
        // Use a format string to pad an integer with zeros to a certain width (in characters)
        System.out.printf("The digital time is %02d:00\n", hour);
        
        // Demonstrate a rounding error that occurs because 0.1 is a recurring fraction in binary
        System.out.print("0.1 * 10 = ");
        System.out.println(0.1 * 10);
        System.out.print("0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 = ");
        System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);
        
        // Concatenate a string and an integer (integer gets converted to string automatically)
        System.out.println("The date today is " + 16 + "th June.");
        
        // Convert from float to int etc. using a type cast operator e.g. (int)
        int inches;
        double cm = 183.0;
        final double CM_TO_INCHES = 2.54;
        inches = (int) (cm / CM_TO_INCHES);
        System.out.printf("%.2f cm is %d inches.\n", cm, inches);
        
        // Create a scanner to get keyboard input
        Scanner in = new Scanner(System.in); // System.in is the string entered on the keyboard
                      // The Scanner object "in" is an iterator that can generate parts of this string
                      // Any string can be passed to a Scanner.
        
        // Prompt user for keyboard input
        System.out.print("Type something: ");
        
        // Get keyboard input and print it
        String line;
        line = in.nextLine(); // Gets one line of text, ending with Enter
        System.out.println("You said: " + line);
        
        // Get an integer from keyboard input
        System.out.print("What is your age? ");
        int age;
        age = in.nextInt(); // Gets the keyboard input as an integer. Doesn't capture newline
        in.nextLine(); // Captures newline
        System.out.printf("You are %d years old.\n", age);
        
        // Get a floating point number from the keyboard
        System.out.print("What is your height in metres? ");
        double height;
        height = in.nextDouble(); // Gets the keyboard input as double. Doesn't capture newline
        in.nextLine(); // Captures newline
        System.out.printf("You are %.2f metres tall.\n", height);
        
        // Generate a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        System.out.print("Here is a random number: ");
        System.out.println(number);
        
        // Demonstrate some Math methods
         double radians = Math.toRadians(180.0);
         double degrees = Math.toDegrees(Math.PI);
         System.out.printf("180 degrees is %.2f radians.\n", radians);
         System.out.printf("pi radians is %.0f degrees.\n", degrees);
         
         // Demonstrate a long integer (int has 32 bits, so max is 2^31 - 1 = 2.15e9, 
         // long has 64 bits, so max is 2^63 - 1 = 9.22e18)
         long longx = Math.round(Math.pow(Math.E, 30.0)); // e^30 = 10.6e12
         System.out.printf("Here is a long integer: %d.\n", longx);
    } 
}