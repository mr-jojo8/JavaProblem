package Problems;

import java.io.File;
import java.io.FileInputStream;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class ProblemFive {
    
    private final static String INPUT_FILE_NAME = "files/input.txt";
    private final static String OUTPUT_FILE_NAME = "output.txt";
    
    public static void main(String args[]) throws Exception {
        File file = new File(INPUT_FILE_NAME);
        
        FileInputStream in = new FileInputStream(file);
        
        int i;
        while((i = in.read()) != -1){
            System.out.print((char) i);
        }
        in.close();
        
        
    }
}
