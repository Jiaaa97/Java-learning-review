package day04;

public class Array_Tab {
    public static void main(String[] args) {
        double[] poids = new  double[] {2.5, 4.0, 1.8, 5.5, 3.2};
        double sum = 0.0;
        double max = 0.0;
        for (int i=0;i < poids.length;i++){
            sum += poids[i];
            if (poids[i]>max){
                max = poids[i];
            }
        }
        System.out.println("The sum of weights is "+sum);
        System.out.println("The max is "+max);
        System.out.println("what is the array 5: "+ poids[5]);
    }
}
