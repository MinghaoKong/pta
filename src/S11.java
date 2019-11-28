import java.util.Scanner;

public class S11 {
    private enum Grade {
        A,B,C,D,E
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int score = scanner.nextInt();
            Grade grade = getGrade(score);
            switch(grade) {
                case A:
                    System.out.println("Excellent");
                    break;
                case B:
                    System.out.println("Good");
                    break;
                case C:
                    System.out.println("Average");
                    break;
                case D:
                    System.out.println("Fair");
                    break;
                case E:
                    System.out.println("Poor");
                    break;
            }
            printGradeInfo(grade);
        }
    }
    public static void printGradeInfo(Grade grade){
        System.out.println("class name=Grade"+Grade.class);
        System.out.println("grade value="+grade);
    }
    private static Grade getGrade(int score) {
        Grade grade;
        if (score >= 90 && score <= 100) {
            grade = Grade.A;
        } else if (score >= 80 && score < 90) {
            grade =  Grade.B;
        } else if (score >= 70 && score <80) {
            grade = Grade.C;
        } else if (score >= 60 && score < 70) {
            grade = Grade.D;
        } else {
            grade = Grade.E;
        }
        return grade;
    }
}
//Excellent
//class name=class Grade
//grade value=A
//        Good
//class name=class Grade
//grade value=B
//        Average
//class name=class Grade
//grade value=C
//        Fair
//class name=class Grade
//grade value=D