package day03;
import java.util.Scanner;

public class Age_checker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your age: ");

        // Senior 做法：永远不要相信用户的输入
        if (scan.hasNextInt()) {
            int age = scan.nextInt();
            if (age < 0 || age > 150) { // 增加边界逻辑检查
                System.out.println("Invalid age range.");
            } else {
                System.out.println(age < 18 ? "Minor" : "Adult");
            }
        } else {
            System.out.println("Error: Please enter a valid integer number.");
        }
        scan.close(); // 养成关闭资源的好习惯
    }
}
