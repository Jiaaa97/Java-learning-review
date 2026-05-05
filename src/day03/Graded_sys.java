package day03;
import java.util.Scanner;

public class Graded_sys {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter score (0-100): ");

        if (!scan.hasNextInt()) {
            System.out.println("Invalid input.");
            return;
        }

        int score = scan.nextInt();

        // 优化点 1：处理非法数值
        if (score < 0 || score > 100) {
            System.out.println("Score must be between 0 and 100.");
            return;
        }

        // 优化点 2：if-else 应该是闭合的，涵盖所有可能
        if (score >= 90) { // 涵盖了 90-100
            System.out.println("Grade A");
        } else if (score >= 80) { // 既然上面不满足，这里自然就是 < 90
            System.out.println("Grade B");
        } else if (score >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Not Passed");
        }
    }
}
