package POO.Student;

import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grade grade = new Grade();
        System.out.println("Enter your name: ");
        grade.name = sc.nextLine();
        System.out.println("Enter your grade of 1st Trimester: ");
        grade.grade1 = sc.nextDouble();

        while (grade.grade1 < 0 || grade.grade1 > 30) {
            System.out.println("Invalid Grade. Enter your grade again with a number between 0 and 30: ");
            grade.grade1 = sc.nextDouble();
        }

        System.out.println("Enter your grade of 2nd Trimester: ");
        grade.grade2 = sc.nextDouble();

        while (grade.grade2 < 0 || grade.grade2 > 35) {
            System.out.println("Invalid Grade. Enter your grade again with a number between 0 and 35: ");
            grade.grade2 = sc.nextDouble();
        }

        System.out.println("Enter your grade of 3rd Trimester: ");
        grade.grade3 = sc.nextDouble();

        while (grade.grade3 < 0 || grade.grade3 > 35) {
            System.out.println("Invalid Grade. Enter your grade again with a number between 0 and 35.");
            grade.grade3 = sc.nextDouble();
        }

        System.out.println("FINAL GRADE: " + grade.finalGrade());
        if (grade.finalGrade() < 60) {
            System.out.println("FAILED. ");
            System.out.println("Missing: " + grade.missingPoints() + " points.");
        } else {
            System.out.println("PASS.");

        }

    }
}
