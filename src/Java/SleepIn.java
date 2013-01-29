/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

/**
 *
 * @author Ganduruu
 */

/**Problem
 * 
 * The parameter weekday is true if it is a weekday, and the parameter vacation is 
 * true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. 
 * Return true if we sleep in.
 */

public class SleepIn {
    
    public boolean sleepIn(boolean weekDay, boolean vacation) {
        if (!weekDay || vacation) {
            return true;
        }
        return false;
    }
    
    public static void main(String args[]) {
        
    }
}
