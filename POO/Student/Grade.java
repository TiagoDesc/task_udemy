package POO.Student;

public class Grade {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public double missingPoints() {
        if (finalGrade() < 60) {
            return 60 - finalGrade();
        } else {
            return 0;
        }
    }

    public String toStringGrade1() {
        return "Invalid Grade. Enter your grade again with a number between 0 and 30.";
    }

    public String toStringGrade2And3() {
        return "Invalid Grade. Enter your grade again with a number between 0 and 35.";
    }

}
