import java.util.Scanner;
import java.util.Arrays;

/**
 * Program to test java concepts such as methods, loops, conditionals and arrays.
 * Also covers Unicode characters and string methods.
 */
public class Test {
    
    /**
     * Checks if a numer is greater than 10.
     */
    public static void checkNum(int num) {
    
        if (num > 10) {
            System.out.println("Greater than 10.");
        } else if (num == 10) {
            System.out.println("Equal to 10.");
        } else {
            System.out.println("Less than 10.");
        }
    }
    
    /**
     * This method is void, so it doesn't return anything.
     * It checks if a number is positive and calculates log(num) if it is. 
     * If the number is negative, it throws an error and returns (without a return value).
     */
    public static void checkPositive(int num){
        if (num < 0) {
            System.err.println("Negative number.");
            return; // return before calculating log(num)
        } else {
            System.out.println("Positive number.");
        }
        System.out.printf("Log(%d) = %.2f\n", num, Math.log(num));
    }
    
    /**
     * This method returns a double: the area of a circle.
     * 
     * @param radius - the radius of the circle
     * @return area - the area of the circle
     */
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius; 
    }
    
    /**
     * This is the main part of the program, where the execution starts.
     * It takes an array of strings as the argument args, 
     * but this is not used unless the class is called from another program or from the command line.
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        // Prompt user for a number (integer)
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        in.nextLine();
        
        checkNum(num); // Check if number entered is >= 10 and print result.
        
        // Declare a boolean variable
        boolean evenFlag = (num % 2 == 0); // true if num is even;
        System.out.print("Number is even: ");
        System.out.println(evenFlag);
        
        checkPositive(num); // Check if number entered is positive and calculate log(num). Throw an error if negative.
        
        double area = calculateArea(7);
        System.out.print("The area of a circle of radius 7 m is: ");
        System.out.printf("%d m^2.\n", Math.round(area)); // area has type double, but Math.round(area) has type int
        
        // While loop
        int n = 3;
        while (n > 0) {
            System.out.println(n); 
            n = n - 1; 
        }
        System.out.println("Blastoff!");
        
        // For loop
        for (int i = 1; i < 10; i++) {   // initialiser, termination condition (while), update (can be --, +=, -=)
                                         // N.B. i is a local variable because it is declared in the for statement
                                         // We could declare int i before the for loop, then write for (i = 1; ...)
            System.out.print(i);
        }
        System.out.println();
        
        // Do while loop (this is a post-test loop like repeat .. until in BASIC)
        int a = 1;
        do {
            System.out.print(a);
            a += 1;
        } while (a < 10);
        System.out.println();
        
        // Demonstrate break and continue
        int b = 9;
        while (true) {
            b -= 1;
            if (b % 2 == 1) {   // if b is odd, continue without printing b
                continue;
            }
            System.out.print(b);  // print b (only happens if b is even)
            if (b <= 0) {
                break;     // break if b <= 0
            }
        }
        System.out.println();
        
        // Declare and create some empty arrays (all values set to 0)
        int[] counts = new int[4];
        double[] values = new double[counts.length];
        System.out.println("The zeroth element of counts[] is " + counts[0]);
         
        // Declare and create an array with values
        int[] vals = {1, 2, 3, 4};
        System.out.println(Arrays.toString(vals));
        
        // Copy an array without aliasing
        int[] vals2 = Arrays.copyOf(vals, vals.length);
        System.out.println(Arrays.toString(vals2));
        
        // Enhanced for loop for looping over elements in an array (like Python for val in vals:)
        for (int val : vals) {
            System.out.print(val);
        }
        System.out.println();
        
        // Character literals have single quotes, whereas strings have double quotes
        char letter = 'a';
        System.out.println(letter++);  // Characters can be incremented
        System.out.println(letter);  // But printing letter++ prints the previous value!
        
        // Use unicode to print the Greek alphabet (capitals)
        System.out.print("Greek alphabet: ");
        for (int i = 913; i <= 937; i++) {
            System.out.print((char) i);  // casts from type int to type char
        }
        System.out.println();
        
        // Examples of string methods
        String asc = "ascii";
        asc = asc.toUpperCase();
        System.out.println(asc);
        asc = asc.replace("ASCII", "Unicode");
        System.out.println(asc);
        
        // Indexing into a string
        String fruit = "Orange";
        letter = fruit.charAt(3);  // Get the 4th character in "Orange" (at index 3 due to 0-indexing)
        System.out.println(letter);
        
        // Get the index of a character within a string (first appearance)
        int index = fruit.indexOf('a');
        System.out.println(index);
        
        // Get the index of a character within a string, starting the search from a particular index
        String twofruits = fruit + fruit;
        System.out.println(twofruits);
        index = twofruits.indexOf('a', 6);
        System.out.println(index);
        index = fruit.indexOf("ran");  // works with a substring
        System.out.println(index);
        
        // To use an enhanced for loop with a string, we have to convert it to an array of characters
        for (char c : fruit.toCharArray()) {
            System.out.print(c);
            System.out.print(" ");
        }
        System.out.println();
        
        // Extract substring
        System.out.println(fruit.substring(2)); // substring from char 2 to end.
        System.out.println(fruit.substring(2, 5)); // substring from char 2 to char 4 inclusive.
        
        // Compare two strings
        String fruit1 = "Orange";
        String fruit2 = "Apple";
        System.out.println(fruit1.equals(fruit2));
        System.out.println(fruit1.compareTo(fruit2));  // +ve if fruit2 alphabetically after fruit1,
                                                       // -ve if fruit2 alphabetically before fruit1,
                                                       // 0 if fruit1 and fruit2 are the same.
        
        // Create a formatted string
        int hour = 2;
        int minute = 34;
        String ampm = "pm";
        String time12hr = String.format("%02d:%02d %s", hour, minute, ampm);
        System.out.println(time12hr);
        
        // Convert a string to an integer, double or boolean and vice versa, using wrapper classes
        String numstr = "12345";
        int newnum = Integer.parseInt(numstr);
        System.out.println(newnum);
        String newnumstr = Integer.toString(newnum);
        System.out.println(newnumstr);
        numstr = "1.23";
        double doublenum = Double.parseDouble(numstr);
        System.out.println(doublenum);
        numstr = "false";
        boolean boolnum = Boolean.parseBoolean(numstr);
        System.out.println(boolnum);
        
        // Test what happens when we do something with the command line input args
        // Try calling this program from the command line as follows:
        // java Test 12 3 4 56
        System.out.println(Arrays.toString(args));
    }
}