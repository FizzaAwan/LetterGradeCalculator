
import java.util.Scanner;

public class LetterGradeToNumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System. in );
        String grade;
        double gd = 0;
        do{

        System.out.print("Enter a letter grade: ");
        grade = in.nextLine();
        
        // your work here
        switch(grade){
            case "A-": 
                gd=3.7;
                break;
            case "A+": 
                gd=4.0;
                break;
            case "A": 
                gd=4;
                break;
            case "B+":
                gd=3.3;
                break;
            case "B-":
                gd=2.7;
                break;
            case "B":
                gd=3;
                break;
            case "C+":
                gd=2.3;
                break;
            case "C-":
                gd=1.7;
                break;
            case "C":
                gd=2;
                break;
            case "D+": 
                gd=1.3;
                break;
            case "D-":
                gd=0.7;
                break;
            case "D":
                gd=1;
                break;
            case "F":
                gd=0;
                break;  
        }
        System.out.println("The numerical value is "+ gd);
        }while(true);
    }
}