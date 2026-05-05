package day04;

public class DebugPoint {
    public static void main(String[] args) {
        say();
        int a = sum(5,6);
    }

    public static void say() {
        System.out.println("Hello");
    }

    public static int sum(int nb1, int nb2){
        int nb = nb1 + nb2;
        return nb;
    }
}
