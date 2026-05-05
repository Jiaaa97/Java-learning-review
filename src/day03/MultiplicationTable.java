package day03;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) { // 外层控制行
            for (int j = 1; j <= i; j++) { // 内层控制列
                // 使用 printf 进行格式化对齐，\t 是制表符
                System.out.printf("%d * %d = %d\t", j, i, (i * j));
            }
            // 每行结束换行
            System.out.println();
        }
    }
}
