package day04;

public class filter_Array {
    public static void main(String[] args) {
        double[] poids = new  double[] {2.5, 4.0, 1.8, 5.5, 3.2};
        int car_nb = 0;
        for (int i=0;i < poids.length; i++){
            if (poids[i]>3){
                car_nb += 1;
                System.out.println(poids[i]);
            }
        }
        System.out.println("The number of cars that are overweighted is "+car_nb);
    }
}
