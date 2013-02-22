/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.home.algorithm;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class CalendarOfDates {
    
    public int calculate() {
        int result = 0;
        int year, month, date;
        int resultYear;
        int tmp = 0;
       
        Scanner sc = new Scanner(System.in);
        
        year = sc.nextInt();
        month = sc.nextInt();
        date = sc.nextInt();
        
        switch(month) {
            case 1  : month = 1; break;
            case 2  : month = 4; break;
            case 3  : month = 4; break;
            case 4  : month = 0; break;
            case 5  : month = 2; break;
            case 6  : month = 5; break;
            case 7  : month = 0; break;
            case 8  : month = 3; break;
            case 9  : month = 6; break;
            case 10 : month = 1; break;
            case 11 : month = 4; break;
            case 12 : month = 6; break;
        }
                
        int parseFirstYear = year / 100;
        int parseSecondYear = year % 100;
        
        tmp = parseSecondYear % 4;
        
        tmp += parseSecondYear / 4 * 5 % 7;
        
        result = date + month + tmp;
        
        return result;
    }
          

    public static void main(String args[]) {
        int resultTmp;
        String day = null;
        
        CalendarOfDates cd = new CalendarOfDates();
        
        int result = cd.calculate();
        
        resultTmp = result % 7;
        
        switch(resultTmp) {
            case 0 : day = "Saturday"; break;
            case 1 : day = "Sunday"; break;
            case 2 : day = "Monday"; break;
            case 3 : day = "Tuesday"; break;
            case 4 : day = "Wednesday"; break;
            case 5 : day = "Thursday"; break;
            case 6 : day = "Friday"; break;
        }        
        System.out.println("Day of Week : " + day);
    }
}
