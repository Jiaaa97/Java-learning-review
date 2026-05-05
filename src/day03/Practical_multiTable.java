package day03;

public class Practical_multiTable {
    public static void main(String[] args) {
        for (int num = 1;num <=9; num++){
            for (int i =1; i<=num;i++){
                if (i%2==1){
                    continue;
                }
                System.out.println("The output is"+i+"*"+num+"="+i*num+"\t");
            }
            System.out.println();
        }

    }
}
