import java.util.Scanner;

public class Grade_calculator {
    public static void main(String[] args) {

        // Here i am Calculating and Displayin the letter grade for a numerical score of a student

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the Student :");
        String name = sc.nextLine();
        System.out.println("Enter the grade of the Student :");
        int score = sc.nextInt();

        char grade;

        if(score >= 90 && score <= 100 ){
            grade = 'A';
        }else if(score >= 80 && score <= 90) {
            grade = 'B';
        } else if (score >= 70 && score <= 80) {
            grade = 'C';
        }else if (score >= 60 && score <= 70) {
            grade = 'D';
        }else {
            grade = 'F';
        }
        System.out.println(name + "grade is :" + grade);


    }
}
