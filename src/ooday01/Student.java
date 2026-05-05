package ooday01;
import java.util.Scanner;

// 学生类
class StudentInfo {
    String name;
    int score;

    StudentInfo(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

// 主类（文件名是 Student.java，所以这个类必须叫 Student）
public class Student {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 创建大小为 3 的 StudentInfo 对象数组
        StudentInfo[] students = new StudentInfo[3];

        // 输入 3 个人的数据
        for (int i = 0; i < students.length; i++) {
            System.out.println("请输入第 " + (i + 1) + " 个学生的信息：");

            System.out.print("姓名: ");
            String name = scan.next();

            System.out.print("分数: ");
            int score = scan.nextInt();

            // 创建对象并存入数组
            students[i] = new StudentInfo(name, score);
            System.out.println();
        }

        // 打印所有学生信息
        System.out.println("===== 学生信息列表 =====");
        for (int i = 0; i < students.length; i++) {
            System.out.println("学生" + (i + 1) + ": " + students[i].name + "，分数: " + students[i].score);
        }

        scan.close();
    }
}