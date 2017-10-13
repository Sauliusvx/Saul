package firstDay.second;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class zaidimas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxVal = printMenu(scanner);
        Random random = new Random();
        int randomGenerated = random.nextInt(maxVal);
        System.out.println("Spejimu skaicius"+playGame(scanner,randomGenerated));



    }
    private static int playGame(Scanner sc,int randomNumb){
        int sk1 = sc.nextInt();


        while (true) {
           // if(randomNumb == 1000 && sk1 ==10) {
              //  System.out.println("Per daug spejimu");
           // }
            try {
                System.out.println("Iveskite sveika skaiciu");


                if (sk1 == randomNumb) {
                    System.out.println("Laimejote!");

                } else {
                    if (sk1 > randomNumb) {
                        System.out.println("Pasirinkite mazesni skaiciu.");

                    } else {
                        System.out.println("Pasirinkite didesni skaiciu.");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Blogas skaicius");
            }
        }
    }

    private static int printMenu(Scanner sc) {
        int temp = 0;
        boolean runUntil = true;
        while (runUntil) {
            System.out.println("Pasirinkite sunkumo lygi\n 1. 1 iki 10\n  2. 1 iki 100\n  3. 1iki 1000");
            try {
                int selection = sc.nextInt();
                switch (selection) {
                    case 1:
                        temp = 10;

                        runUntil = false;
                        break;
                    case 2:
                        temp = 100;
                        runUntil = false;
                        break;
                    case 3:
                        temp = 1000;
                        runUntil = false;
                        break;
                    default:
                        System.out.println("Nera tokio meniu punkto");
                        break;
                }
            }catch (InputMismatchException e) {
                System.out.println("Blogas formatas, pakartokite");
                sc.nextLine();
            }
        }

        return temp ;
    }

}

