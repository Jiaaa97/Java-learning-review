package day04;
import java.util.Scanner;

public class MethodIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter score (0-100): ");
        if (!scan.hasNextInt()) {
            System.out.println("Invalid input.");
            return;
        }
        int score = scan.nextInt();
        String grade = getGrade(score);
        System.out.println(grade);
    }
    /*
    no variable settings
    public static void say(){
    just print out ...}
     */
    public static String getGrade(int score){
        if (score < 0 || score > 100) {
            System.out.println("Score must be between 0 and 100.");
            return null;
        }
        if (score >= 90) {
            return"Grade A";
        } else if (score >= 80) {
            return"Grade B";
        } else if (score >= 60) {
            return"Grade C";
        } else {
            return "Grade F";
        }
    }
}
