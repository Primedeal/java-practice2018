package ifElseStatement;

public class IfElseStatement 
{
public static void main(String[] args) 
{
        int testscore = 46;
        char grade;

        if (testscore >= 90) 
        {
            grade = 'A';
            
        } 
        else if (testscore >= 80) 
        {
            grade = 'B';
            
        } 
        else if (testscore >= 70) 
        {
            grade = 'C';
            
        } 
        else if (testscore >= 60) {
            grade = 'D';
        } 
        else 
        {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
}
}
