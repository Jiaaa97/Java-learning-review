package day02;
import java.util.Scanner;

public class Rules {
    public static void main(String[] args) {
        //System.out.println('3'+'3'); // how to compute the bytes
        Scanner scan = new Scanner(System.in);// now we create a scanner in the system
        System.out.println("How old are u:");
        int age = scan.nextInt();//scan the value we put
        if (age < 18){
            System.out.println("A minor, not adult");
        }else{
            System.out.println("An adult");
        }

        System.out.println(age);
    }
}
