/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.home.algorithm;

/**
 *
 * @author user
 */
public class BubbleSortAlgorithm {

    public void bubbleSort(int[] array) {
        boolean swapped = true;
        int j = 0;
        int temp;
        
        while (swapped) {
            swapped = false;
            j++;

            for (int i = 0; i < array.length - j; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    
                    swapped = true;
                }
            }
        }

    }

    public static void main(String args[]) {
        BubbleSortAlgorithm bb = new BubbleSortAlgorithm();

        
        int intArray[] = new int[]{5, 90, 35, 45, 150, 3};
        
        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        //sort an array using bubble sort algorithm
        bb.bubbleSort(intArray);

        System.out.println("");

        //print array after sorting using bubble sort algorithm
        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}
