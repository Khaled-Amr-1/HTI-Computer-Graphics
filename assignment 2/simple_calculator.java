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
        Scanner in = new Scanner(System.in);
       for (int i =1; i==1; ){
           
       System.out.println("Please Enter the first number : ");
       double num1 = in.nextDouble();
       System.out.println("Please Enter secnod number : ");
       double num2 = in.nextDouble();
       System.out.println("please choose the operator ( * , / , + , -  )");
       char operator = in.next().charAt(0);
       
       switch(operator){
           case '*':
               System.out.println("Answer = " + num1 * num2 );
               break;
            case '+':
               System.out.println("Answer = " + (num1 + num2) );
               break;
            case '-':
               System.out.println("Answer = " + (num1 - num2 ) );
               break;
            case '/':
               System.out.println("Answer = " + num1 / num2 );
               break;
            
       }
       System.out.println("do you want to exit choose y or n ");
       char exit = in.next().charAt(0);
       if (exit == 'y'){
           break;
       }
       
    }
    
}
}
