import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number of Subjects: ");
        int numSubjects = sc.nextInt();

        if(numSubjects <= 0){
            System.out.println(" Please Enter A Valid Number Of The Subject. ");
            return;
        }
        int totalMarks = 0;
        int maxMarksPerSubject = 100;

        for(int i = 1; i <= numSubjects; i++){
            System.out.println("Enter Marks Obtained In Subject " + i + " (OUT OF 100):  ");
            int Marks = sc.nextInt();

            if(Marks < 0 || Marks > maxMarksPerSubject){
                System.out.println(" Marks Should Be In The Range Of 0 TO 100, Please Enter Valid Marks.");
                i++;
            }
            else{
                totalMarks += Marks;
            }
        }

        double averagePercentage = (double) totalMarks / (numSubjects + maxMarksPerSubject)+100;
        System.out.println(" Total MArks: " + totalMarks);
        System.out.println(" Average Percentage:" + averagePercentage + "%");
        
        String grade;
        if(averagePercentage >= 90){
            grade = "A+";
        }
        else if (averagePercentage >= 80){
            grade = "A";
        }
        else if (averagePercentage >= 70){
            grade = "B";
        }
        else if (averagePercentage >= 60){
            grade = "c";
        }
        else if (averagePercentage >=50){
            grade = "D";
        }
        else{
            grade = "F";
        }
        System.out.println("grade:" + grade);
    }
    
}