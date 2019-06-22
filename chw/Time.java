/**
 * Time class
 * 
 * @param hour
 * @param minute 
 * @param second
 * 
 * @return Time object
 */
public class Time{
    
    // Declare instance variables (attributes)
    private int hour;
    private int minute;
    private double second;
    
    /**
     * Bare constructor for Time objects (no parameters)
     */
    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }
    
    /**
     * Value constructor for Time objects
     */
    public Time(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    /**
     * Getter for the hour attribute
     */
    public int getHour() {
        return this.hour;
    }
    
    /**
     * Getter for the minute attribute
     */
    public int getMinute() {
        return this.minute; 
    }
    
    /**
     * Getter for the second attribute
     */
    public double getSecond() {
        return this.second;
    }
    
    /**
     * Setter for the hour attribute
     */
    public void setHour(int hour) {
        this.hour = hour;
    }
    
    /**
     * Setter for the minute attribute
     */
    public void setMinute(int minute) {     
        this.minute = minute;
    }
    
    /**
     * Setter for the second attribute
     */
    public void setSecond(double second) {
        this.second = second;
    }
    
    /**
     * Override the default toString method to make a string represenation of a Time object
     */
    public String toString() {
        return String.format("%02d:%02d:%04.1f", this.hour, this.minute, this.second);
    }
    
    /**
     * Override the defauls equals method to determine if two Time objects are equivalent
     */
    public boolean equals(Time that) {
        return this.hour == that.hour 
            && this.minute == that.minute 
            && this.second == that.second; 
    }

}