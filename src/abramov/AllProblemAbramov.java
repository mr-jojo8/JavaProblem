/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abramov;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Ganduruu
 */
public class AllProblemAbramov {
    
    private static final String NUMBER_FORMAT = "#0.0";
    
    Scanner sc = new Scanner(System.in);
    double a, b;
    
    NumberFormat nf = new DecimalFormat(NUMBER_FORMAT);
    
    public void ProblemOne() {
        //а, b хоёр бодит тоо өгөгдөв. Эдгээр тоонуудын нийлбэр, ялгавар, үржвэрийг ол.
        System.out.println("Problem One Start");
        
        a = sc.nextDouble();
        b = sc.nextDouble();

        System.out.println("Result : " + nf.format(a + b));
        System.out.println("Problem One End");
    }
    
    public void ProblemTwo() {
        //x, y хоёр бодит тоо өгөгдөв. Илэрхийллийн утгыг ол: 
        //(|x|-|y|)/(1+|xy|)
        System.out.println("Problem Two Start");
        
        a = sc.nextDouble();
        b = sc.nextDouble();
        
        double result;
        
        result = ((Math.abs(a) - Math.abs(b)) / (1 + Math.abs(a * b)));
        System.out.println("Result : " + result);
        System.out.println("Problem Two End");
    }
    
    public void ProblemThree() {
        //Хоёр эерэг бодит тоо өгөгдөв. Тэдгээрийн арифметик ба геометр дунджийг ол.
        
        System.out.println("Problem Three Start");
        
        a = sc.nextDouble();
        b = sc.nextDouble();
        
        double geoAverage;
        double arithAverage;
        
        geoAverage = Math.sqrt(a * b);
        arithAverage = (a + b) / 2;
        
        System.out.println("Arithmetic : " + nf.format(arithAverage) + "\nGeometr : " + nf.format(geoAverage));
        System.out.println("Problem Three End");
    }
    public static void main(String args[]) {
        AllProblemAbramov allAbromov = new AllProblemAbramov();
        allAbromov.ProblemOne();
        allAbromov.ProblemTwo();
        allAbromov.ProblemThree();
    }
}