/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.home.algorithm;

import java.util.Scanner;

/**
 *
 * @author Ganduruu
 */
public class UsageStack {

    private int[] array;
    private int count, size;
    
    
    public UsageStack(int n) {
        size = n;
        array = new int[n];
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isfull() {
        return count == size;
    }

    public void push(int val) {
        if (!isfull()) {
            array[count] = val;
            count++;
        }
    }

    public int pop() throws Exception {
        if (!isEmpty()) {
            count--;
            return array[count];
        } else {
            throw new Exception("stack empty");
        }
    }

    public void Print() {
        Scanner sc = new Scanner(System.in);
        if (!isEmpty()) {
            int i = count - 1;
            while (i >= 0) {
                System.out.println(array[i]);
                i--;
            }
        }
    }

    public int top() throws Exception {
        if (!isEmpty()) {
            int i = count - 1;
            return array[i];
        } else {
            throw new Exception("stack empty");
        }
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Push - Stack-d utga nemeh\n2. Pop - Stack-n utga ustgah\n3. Top - Oroin element harah\n4. Stack-n element harah\n5. Garah");
            System.out.print("Stack-n hemjeegee oruulna uu: ");
            int urt = sc.nextInt();
            
            int tooluur = 0;
            UsageStack st = new UsageStack(urt);
            int r = 0;
            while (r < 1)
            {
                System.out.print("Commandiin utga oruul: ");
                int cmd = sc.nextInt();
                switch (cmd)
                {
                    case 1: System.out.print("Stack-d baix elementiin toog oruul: ");
                        tooluur = sc.nextInt();
                        System.out.println("Stack-d elementuudiig oruulna uu: ");
                        for (int i = 0; i <= tooluur - 1; i++)
                        {
                            st.push(sc.nextInt());
                        }
                        break;
                    case 2:
                        System.out.println("Stack-s utga hasah: " + (st.pop()));
                        break;
                    case 3:
                        System.out.println("Stack-n oroin element: " + (st.top()));
                        break;
                    case 4:
                        System.out.println("Stack-n elementuud:");
                        st.Print();
                        break;
                    case 5:
                        
                        break;
                }
            }
    }
}
