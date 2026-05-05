package day03;

import java.util.Scanner;

public class switch_score_sys {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your score:");
        int score = scan.nextInt();
        switch (score) {
            case 85:
                System.out.println("Grade A" + " " + score);
                break;
            case 70:
                System.out.println("Grade B" + " " + score);
                break;
            case 60:
                System.out.println("Grade C" + " " + score);
                break;
            default:
                System.out.println("Not Passed" + " " + score);
        }

    }
}
