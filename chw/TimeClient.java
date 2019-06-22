/**
 * Time client - creates Time objects
 */
public class TimeClient {
    public static void main (String[] args) {
        
        // Create a Time object t to test the class Time that I've created in Time.java
        Time t = new Time();
        
        // Print reference to t
        System.out.println(t);
        
        // Create another Time object t2 with values to initialise the attributes
        Time t2 = new Time(2, 3, 4.0);
        
        // Print t2 attributes
        System.out.println(t2.getHour());
        System.out.println(t2.getSecond());
        
        // Set t2 attributes to different values
        t2.setHour(5);
        t2.setSecond(6.5);
        System.out.println(t2.getHour());
        System.out.println(t2.getSecond());
        
        // Print the string representation of t2
        System.out.println(t2);
        
        // Create another Time object t3 to compare with t2 for equivalence
        Time t3 = new Time(7, 2, 9.0);
        System.out.println(t2.equals(t3));
    }
}
