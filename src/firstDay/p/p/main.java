package firstDay.p.p;

import java.util.Scanner;

public class main {
    public  static  void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite du skaicius ir operacija pvz x + y:");
        String insertVal = scanner.nextLine();
        String[] split = insertVal.split(" ");
        if(split.length==3){
            c calculator= new c();
            try {
                int numb = Integer.valueOf(split[0]);
                int numbSec = Integer.valueOf(split[2]);
                int result = 0;
                switch (split[1]) {
                    case "+":
                        calculator.suma(numb, numbSec);
                        break;
                    case "-":
                        calculator.skirtumas(numb, numbSec);
                        break;
                    case "*":
                        calculator.sandauga(numb, numbSec);
                    default:
                        System.out.println("Nera tokios operacijos");
                        break;
                }
                System.out.println("Resultatas->>" + result);
            }catch (NumberFormatException e){
                System.out.println("Blogai ivesta");
            }
            } else {
            System.out.println("Paleisk programa is naujo");
        }
    }
}
