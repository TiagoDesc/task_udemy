package POO.Student;

import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grade grade = new Grade();
        System.out.println("Enter your name: ");
        grade.name = sc.nextLine();
        System.out.println("Enter your grade of 1rd Trimester: ");
        grade.grade1 = sc.nextDouble();
        System.out.println("Enter your grade of 2rd Trimester: ");
        grade.grade2 = sc.nextDouble();
        System.out.println("Enter your grade of 3rd Trimester: ");
        grade.grade3 = sc.nextDouble();

        System.out.println("FINAL GRADE: " + grade.finalGrade());
        if (grade.finalGrade() < 60) {
            System.out.println("FAILED. ");
            System.out.println("Missing: " + grade.missingPoints() + " points.");
        } else {
            System.out.println("PASSED. ");

        }

    }
}
