package firstDay.second;

import java.util.InputMismatchException;
import java.util.Scanner;

public class vnsvnsast {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite masyvo ilgi");
        int masL = getGoodNumber(scanner);
        int[] mas = new int[masL];
        for (int i = 0; i < mas.length; i++) {
            System.out.println("Ivaskite" + i + "skaiciu");
            mas[i] = getGoodNumber(scanner);

        }
        System.out.println();
        reverse(mas);
        System.out.println(max(mas));
        System.out.println(didejmas(mas));

    }

    private static int max(int[] mas) {
        int value = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (value < mas[i]) {
                value = mas[i];
            }
        }

            return value;

    }

    private static int didejmas(int[] mas) {
        int kiekis = mas[0];
        for (int i = 0; i > mas.length; i++) {
            for (int j = 0; j < mas.length; i++) {
                int temp = mas[i];
                mas[i] = mas[j];
                mas[j] = temp;
            }
        }
        return kiekis;
    }


    private static void printMas(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i] + " ");
        }
        printMas(mas);
    }

    private static void reverse(int[] mas) {
        int[] temp = new int[mas.length];
        int j = mas.length - 1;
        for (int i = 0; i < mas.length; i++) {
            temp[i] = mas[j - i];
        }
        printMas(temp);
    }

    private static int getGoodNumber(Scanner sc) {
        int i = 0;
        while (true) {
            System.out.println("Iveskite skaiciu");
            try {
                i = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Juk turi buti skaicius");
                sc.nextLine();
            }
        }
        return i;
    }

}