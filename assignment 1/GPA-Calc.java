/**
 * This Program written by Khaled Amr for a Computer Graphics course in the Higher Technological Institute.
 * You can get upgraded versions of it in my github acc. (Khaled-Amr-1)
 */
import java.util.Scanner;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
     double A = 4.0;
     double A_minus = 3.7;
     double B_plus = 3.3;
     double B = 3.0;
     double B_minus = 2.7;
     double C_plus = 2.3;
     double C = 2.0;
     double C_minus = 1.7;
     double D_plus = 1.3;
     double D = 1.00;
     double F = 0.0;
     double n1 = 0;    
     double n2 = 0;
     double n3 = 0;
     double n4 = 0;
     double n5 = 0;
     double n6 = 0;
     double n7 = 0;
     double n8 = 0;

    Scanner in = new Scanner(System.in);
    System.out.println("Welcome to HTI GPA Calculator ");
    System.out.println("Please Enter your grade in Capital letters ");
    
    System.out.println("Please Enter your grade in math 1 : ");
    String grade_math = in.nextLine();
    switch(grade_math)
    {
        case "A" : n1 = (3 * A );
        break;
        case "A-": n1 = (3 * A_minus );
        break;
        case "B+": n1 = (3 * B_plus );
        break;
        case "B": n1 = (3 * B );
        break;   
        case "B-": n1 = (3 * B_minus );
        break;
        case "C+": n1 = (3 * C_plus );
        break; 
        case "C": n1 = (3 * C );
        break;
        case "C-": n1 = (3 * C_minus );
        break;
        case "D+": n1 = ( 3 * D_plus );
        break;   
        case "D": n1 = (3 * D );
        break;
        case "F": n1 = (3 * F );
        break;
            
    }
    
    System.out.println("Please Enter your grade in Electronics 1 : ");
    String grade_electronics = in.nextLine();
        switch(grade_electronics)
    {
        case "A" : n2 = (4 * A );
        break;
        case "A-": n2 = (4 * A_minus );
        break;
        case "B+": n2 = (4 * B_plus );
        break;
        case "B": n2 = (4 * B );
        break;   
        case "B-": n2 = (4 * B_minus );
        break;
        case "C+": n2 = (4 * C_plus );
        break; 
        case "C": n2 = (4 * C );
        break;
        case "C-": n2 = (4 * C_minus );
        break;
        case "D+": n1 = ( 4 * D_plus );
        break;   
        case "D": n2 = (4 * D );
        break;
        case "F": n2 = (4 * F );
        break;
            
    }

    System.out.println("Please Enter your grade in Physics : ");
    String grade_physics = in.nextLine();
        switch(grade_physics)
    {
        case "A" : n3 = (3 * A );
        break;
        case "A-": n3 = (3 * A_minus );
        break;
        case "B+": n3 = (3 * B_plus );
        break;
        case "B": n3 = (3 * B );
        break;   
        case "B-": n3 = (3 * B_minus );
        break;
        case "C+": n3 = (3 * C_plus );
        break; 
        case "C": n3 = (3 * C );
        break;
        case "C-": n3 = (3 * C_minus );
        break;
        case "D+": n1 = ( 3 * D_plus );
        break;   
        case "D": n3 = (3 * D );
        break;
        case "F": n3 = (3 * F );
        break;
            
    }

    System.out.println("Please Enter your grade in ITC : ");
    String grade_ITC = in.nextLine();
    switch(grade_ITC)
    {
        case "A" : n4 = (4 * A );
        break;
        case "A-": n4 = (4 * A_minus );
        break;
        case "B+": n4 = (4 * B_plus );
        break;
        case "B": n4 = (4 * B );
        break;   
        case "B-": n4 = (4 * B_minus );
        break;
        case "C+": n4 = (4 * C_plus );
        break; 
        case "C": n4 = (4 * C );
        break;
        case "C-": n4 = (4 * C_minus );
        break;
        case "D+": n4 = ( 4 * D_plus );
        break;   
        case "D": n4 = (4 * D );
        break;
        case "F": n4 = (4 * F );
        break;
            
    }

    System.out.println("Please Enter your grade in computer graphics : ");
    String grade_computer_graphics = in.nextLine();
    switch(grade_computer_graphics)
    {
        case "A" : n5 = (2 * A );
        break;
        case "A-": n5 = (2 * A_minus );
        break;
        case "B+": n5 = (2 * B_plus );
        break;
        case "B": n5 = (2 * B );
        break;   
        case "B-": n5 = (2 * B_minus );
        break;
        case "C+": n5 = (2 * C_plus );
        break; 
        case "C": n5 = (2 * C );
        break;
        case "C-": n5 = (2 * C_minus );
        break;
        case "D+": n5 = ( 2 * D_plus );
        break;   
        case "D": n5 = (2 * D );
        break;
        case "F": n5 = (2 * F );
        break;
            
    }

    System.out.println("Please Enter your grade in English 1 : ");
    String grade_english = in.nextLine();
    switch(grade_english)
    {
        case "A" : n6 = (1 * A );
        break;
        case "A-": n6 = (1 * A_minus );
        break;
        case "B+": n6 = (1 * B_plus );
        break;
        case "B": n6 = (1 * B );
        break;   
        case "B-": n6 = (1 * B_minus );
        break;
        case "C+": n6 = (1 * C_plus );
        break; 
        case "C": n6 = (1 * C );
        break;
        case "C-": n6 = (1 * C_minus );
        break;
        case "D+": n6 = ( 1 * D_plus );
        break;   
        case "D": n6 = (1 * D );
        break;
        case "F": n6 = (1 * F );
        break;
            
    }

    System.out.println("Please Enter your grade in P.E : ");
    String grade_PE = in.nextLine();
    switch(grade_PE)
    {
        case "A" : n7 = (1 * A );
        break;
        case "A-": n7 = (1 * A_minus );
        break;
        case "B+": n7 = (1 * B_plus );
        break;
        case "B": n7 = (1 * B );
        break;   
        case "B-": n7 = (1 * B_minus );
        break;
        case "C+": n7 = (1 * C_plus );
        break; 
        case "C": n7 = (1 * C );
        break;
        case "C-": n7 = (1 * C_minus );
        break;
        case "D+": n7 = ( 1 * D_plus );
        break;   
        case "D": n7 = (1 * D );
        break;
        case "F": n7 = (1 * F );
        break;
            
    }

    System.out.println("Please Enter your grade in cultural course : ");
    String grade_cultural_course = in.nextLine();
    switch(grade_cultural_course)
    {
        case "A" : n8 = (1 * A );
        break;
        case "A-": n8 = (1 * A_minus );
        break;
        case "B+": n8 = (1 * B_plus );
        break;
        case "B": n8 = (1 * B );
        break;   
        case "B-": n8 = (1 * B_minus );
        break;
        case "C+": n8 = (1 * C_plus );
        break; 
        case "C": n8 = (1 * C );
        break;
        case "C-": n8 = (1 * C_minus );
        break;
        case "D+": n8 = ( 1 * D_plus );
        break;   
        case "D": n8 = (1 * D );
        break;
        case "F": n8 = (1 * F );
        break;
            
    }
    double Total_GPA = (( n1 + n2 + n3 + n3 +n4 + n5 + n6 + n7 + n8 ) / 19) ;
    System.out.println("Your GPA is : " + Total_GPA );
    }
}
