package firstDay;

import java.util.Scanner;

public class FirstDayTask {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Iveskite svori");
        int weight=sc.nextInt();
        System.out.println("Iveskite ugi");
        double height = sc.nextDouble();

        /*double kmi = weight/(height*height);*/
        //double kmi = kmi(weight,height);
        System.out.println("kmi"+kmi(weight,height));
    }

    private static double kmi(int weight, double height){
        return weight/(height*height);


    }
}
