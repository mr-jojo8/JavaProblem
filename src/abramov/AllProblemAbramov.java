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
    
    static Scanner sc = new Scanner(System.in);
    static double a, b;
    
    NumberFormat nf = new DecimalFormat(NUMBER_FORMAT);
    
    public static void Util() {
        a = sc.nextDouble();
        b = sc.nextDouble();
    }
    
    public void ProblemOne() {
        Util();        

        System.out.println("Result : " + nf.format(a + b));
    }
    
    public void ProblemTwo() {        
        Util();                
        
        double result;
        
        result = ((Math.abs(a) - Math.abs(b)) / (1 + Math.abs(a * b)));
        System.out.println("Result : " + result);
    }
    
    public void ProblemThree() {
        Util();
        
        double geoAverage;
        double arithAverage;
        
        geoAverage = Math.sqrt(a * b);
        arithAverage = (a + b) / 2;
        
        System.out.println("Arithmetic : " + nf.format(arithAverage) + "\nGeometr : " + nf.format(geoAverage));
    }
    
    public void ProblemFour() {
        Util();
        
        double arithAverage = (a + b) / 2;
        double geoAverage = Math.sqrt((Math.abs(a) * Math.abs(b)));
        
        System.out.println("Arithmetic : " + nf.format(arithAverage) + "\nGeometr : " + nf.format(geoAverage));
    }
    
    public void ProblemFive() {
        Util();
        
        double c = Math.sqrt(a * a + b * b);
        double s = (a * b) / 2;
        
        System.out.println("hypotenuse  : " + nf.format(c) + "\nSquare : " + nf.format(s));      
    }
    
    public void ProblemSix() {
        double pi = 3.14;
        double r = sc.nextDouble();
        double n = sc.nextDouble();
        
        double result = 0;
        if(n > 2) {
            result = n * Math.sqrt(2 * r * r - 2 * r * r * Math.cos(2 * pi / n));
        }
        
        System.out.println("Result : " + nf.format(result));        
    }
    
    public void ProblemSeven() {
        int n = sc.nextInt();
        double num;
        double result = 0;
        for(int i = 1; i <= n; i++) {
            num = sc.nextDouble();
            result += num;
        }
        
        System.out.println("Result : " + nf.format(result));
    }
    
    public void ProblemEight() {
        int a = sc.nextInt();
        
        int last = a % 2;
        if(last == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    
    public void ProblemNine() {
        Util();
        
        double c = sc.nextDouble();
        
        if(a > b && b > c) {
            System.out.println("max : " + nf.format(a));
        } else if(b > c && c > a){
            System.out.println("max : " + nf.format(b));
        } else {
            System.out.println("max : " + nf.format(c));
        }
        
        double add = a + b + c;
        double mult = a * b * c;
        System.out.println("Max : " + nf.format(Math.max(add, mult)));
    }
    
    public void ProblemTen() {
        int n = sc.nextInt();
        int a = 0, b = 0, c = 0;
        
        if(a <= b && b <= c && c <= n) {
            
        }
       
    }
    
    public void ProblemEleven() {
        int n = sc.nextInt();
        
        int count = 0;
        while(n > 0) {
            count++;
            n = n / 10;            
        }
        
        System.out.println("Count : " + count);
    }
    
    public void ProblemTwelve() {
        int hour   = sc.nextInt();
        int minut  = sc.nextInt();
        int second = sc.nextInt();
        
        if(second > 59) {
            minut  = minut  + second / 60;
            second = second % 60;
        }
        
        if(minut > 59) {
            hour  = hour  + minut / 60;
            minut = minut % 60;
        }
        
        if(hour > 23) {
            hour = hour % 24;
        }
        System.out.println("HH:MM:SS : " + hour + " : " + minut + " : " + second);
        
        int lastHour   = sc.nextInt();
        int lastMinut  = sc.nextInt();
        int lastSecond = sc.nextInt();
        
        if(lastSecond > 59) {
            lastMinut  = lastMinut  + lastSecond / 60;
            lastSecond = lastSecond % 60;
        }
        
        if(lastMinut > 59) {
            lastHour  = lastHour  + lastMinut / 60;
            lastMinut = lastMinut % 60;
        }
        
        if(lastHour > 23) {
            lastHour = lastHour % 24;
        }
        
        lastHour   = hour   + lastHour;
        lastMinut  = minut  + lastMinut;
        lastSecond = second + lastSecond;
        
        if(lastSecond > 59) {
            lastMinut  = lastMinut + 1;
            lastSecond = lastSecond - 60;
        }
        
        if(lastMinut > 59) {
            lastHour  = lastHour + 1;
            lastMinut = lastMinut - 60;
        }
        
        if(lastHour > 23) {
            lastHour = lastHour - 24;
        }
       
        System.out.println("HH:MM:SS : " +  lastHour + " : " + lastMinut + " : " + lastSecond);
    }
    
    public void ProblemThirtheen(){
        int a = sc.nextInt();
        
        int tmp = 0;
        int sum = 0;
        int b;
        
        while(a > 0) {
            tmp = a % 10;

            sum = sum + (tmp * tmp * tmp);
        }
        
        System.out.println(sum + " : " + tmp);
        
    }
    
    public static void main(String args[]) {
        AllProblemAbramov allAbromov = new AllProblemAbramov();
        int cmd;
        int a = 0;
        //while(a < 1) {
            System.out.print("Enter Problem number : " );   
            cmd = sc.nextInt();
            
            switch(cmd) {
                case 1 : 
                    System.out.println("Problem No: 1 | а, b хоёр бодит тоо өгөгдөв. Эдгээр тоонуудын нийлбэр, ялгавар, үржвэрийг ол.");
                    allAbromov.ProblemOne();
                    break;                    
                case 2 :
                    System.out.println("Problem No: 2 | x, y хоёр бодит тоо өгөгдөв. Илэрхийллийн утгыг ол (|x|-|y|)/(1+|xy|)");
                    allAbromov.ProblemTwo();
                    break;
                case 3 :
                    System.out.println("Problem No: 3 | Хоёр эерэг бодит тоо өгөгдөв. Тэдгээрийн арифметик ба геометр дунджийг ол.");
                    allAbromov.ProblemThree();
                    break;                    
                case 4 : 
                    System.out.println("Problem No: 4 | Хоёр бодит тоо өгөгдөв. Тэдгээрийн арифметик дундаж болон модулиудынх нь геометр дунджийг ол.");
                    allAbromov.ProblemFour();
                case 5 :
                    System.out.println("Problem No: 5 | Тэгш өнцөгт гурвалжны катетууд өгөгдөв. Гипотенуз ба талбайг ол.");
                    allAbromov.ProblemFive();
                case 6 :
                    System.out.println("Problem No: 6 | r радиустай тойрогт багтсан зөв n өнцөгтийн периметрийг ол. Пи тоог 3.14-тэй тэнцүү гэж үз.");
                    allAbromov.ProblemSix();
                case 7 :
                    System.out.println("Problem No: 7 | n натурал тоо ба a1, ..., an бодит тоонууд өгөгдөв. Дараах илэрхийллийн утгыг ол: a1+...+an");
                    allAbromov.ProblemSeven();
                    break;
                case 8 :
                    System.out.println("Problem No: 8 | Өгөгдсөн бүхэл тоог тэгш эсэхийг шалга.");
                    allAbromov.ProblemEight();
                    break;
                case 9 :
                    System.out.println("Problem No: 9 | x, y бодит тоонууд өгөгдөв. max(x, y)-г ол.");
                    allAbromov.ProblemNine();
                case 11 :
                    System.out.println("Problem No: 11 | n натурал тоо өгөгдөв. n тоо хэдэн цифртэй вэ?");
                    allAbromov.ProblemEleven();
                    break;
                case 12 : 
                    System.out.println("Problem No: 12 | ");
                    allAbromov.ProblemTwelve();
                    break;
                case 13 :
                    System.out.println("Problem No: 13 | Amstrong number");
                    allAbromov.ProblemThirtheen();
                    break;
            }                
    }
}