import java.util.Scanner;

public class NewMain {

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
    double Total_GPA = ((n1 + n2 + n3) / 10) ;
    System.out.println("Your GPA is : " + Total_GPA );
    }
}
