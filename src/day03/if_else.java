package day03;
import java.util.Scanner;


public class if_else {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Please enter your score:");
        int score = scan.nextInt();
        if (score >= 85 && score < 100){
            System.out.println("Grade A"+" "+score);
        } else if (score >= 70 && score < 85) {
            System.out.println("Grade B"+" "+score);
        } else if (score >= 60 && score < 70) {
            System.out.println("Grade C"+" "+score);
        }else{
            System.out.println("Not Passed"+" "+score);
        }
    }
}
