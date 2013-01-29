/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abramov;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author Ganduruu
 */
public class Arithmetic {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float sum = 0;
        sum = a + b;
        
        System.out.println("Sum : " + sum);
    }
}
