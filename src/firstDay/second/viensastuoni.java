package firstDay.second;

import java.util.Scanner;

public class viensastuoni {
    public  static  void main(String[]args){

       //try{
        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite pirmos krastines ilgi");
        double sk1 = sc.nextDouble();

        System.out.println("Iveskite antros krastines ilgi");
        double sk2= sc.nextDouble();

        System.out.println("Atsakymas:"+(sk1*sk2));

    // }catch (NumberFormatException e) {
          // System.out.println("Bolgai ivesta");


    //private static double Atsakymas(double sk1,double sk2){
       // return sk1*sk2;

    }
}
