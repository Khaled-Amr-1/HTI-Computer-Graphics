/**
 * This Program written by Khaled Amr for a Computer Graphics course in the Higher Technological Institute.
 * You can get upgraded versions of it in my github acc. (Khaled-Amr-1)
 */

import java.util.Scanner;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       int num_given;
       int factorial = 1;
       int i = 1;
       Scanner in = new Scanner(System.in);
       System.out.println("Welcome to Factorial calculator ");
       System.out.println("Please Enter an integar number : ");
       num_given = in.nextInt();
       
       while (i<=num_given){
           factorial = factorial * i;
           i++;
       }
       System.out.println("Factorial for " + num_given + " is " + factorial);
    }
    
}
