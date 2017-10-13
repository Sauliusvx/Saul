package firstDay;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstDay2Task {
    //private static double kelias;
    //private  static  double kuras;
    // public static void main(String[] args) {
    // readData();
    //    ats();
    // }
    // private static void readData(){
    //  Scanner sc = new Scanner(System.in);
    //   System.out.println("Iveskite kuro kieki:");
    //  double kuras = sc.nextDouble();
    // System.out.println("Iveskite nuvaziuota kelia:");
    // double kelias = sc.nextDouble();
    //  System.out.println("vidurkis"+ats(kuras,kelias));
    // }

    // private static double ats(double kuras, double kelias){
    //   return (kuras*100)/kelias;


    public static void main(String[] args) {
        System.out.println(readData());

    }

    private static double readData() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite kuro kieki:");

            double kuras = getCorrectValue(scanner);
            System.out.println("Iveskite nuvaziuota kelia:");
            double kelias = getCorrectValue(scanner);
             return ats(kelias,kuras);

        }



    private static double ats(double kelias, double kuras) {
        return (kuras * 100) * kelias;
    }

    private static double getCorrectValue(Scanner scanner) {
        double response = 0.0;
       while(true) {

           try {
                response = scanner.nextDouble();
               break;
           } catch (InputMismatchException e) {
               System.out.println("Ivesta bloga reiksme");
               scanner.nextLine();
           }
       }
        return response;
    }
}