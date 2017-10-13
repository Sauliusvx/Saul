package firstDay.second;

import java.util.Scanner;

public class vnsdu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite zodi:");
        String zodis =sc.nextLine();
        while(!zodis.equals("Pabaiga")) {
            System.out.println(zodis);
            zodis = sc.nextLine();
        }




    }
}