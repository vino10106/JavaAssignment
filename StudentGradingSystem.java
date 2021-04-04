import java.util.Arrays;
import java.util.Scanner;

public class StudentGradingSystem {

    static String Grade(int Avg){
        if  (Avg >= 80) {
            return "Grade 'A'";
        }else if (  Avg <80 && Avg >=60) {
            return "Grade 'B'";
        }else if  (Avg <60 && Avg >=40) {
            return "Grade 'C'";
        }else {
            return "Grade 'D'";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the Number of subjects");
        int numberofSubjects = scan.nextInt();
        int Marks[] = new int[numberofSubjects];
        for (int i = 0; i < numberofSubjects; i++) {
            System.out.println(i+1+" subject Mark");
            Marks[i] = scan.nextInt();
        }
        scan.close();
        int Total=0;
        for(int j=0;j<Marks.length;j++)
        {
            Total+=Marks[j];
        }
        int Avg;
        Avg=Total/numberofSubjects;
        System.out.println("Total Mark is "+Total);
        System.out.println("The Average Mark is "+ Avg+" and "+Grade(Avg));
    }
}