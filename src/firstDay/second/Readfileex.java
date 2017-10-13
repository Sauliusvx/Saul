package firstDay.second;

import java.io.*;

public class Readfileex {
    public  static  void main(String[]args){

        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File("vardas.txt")));
            String line;
            while ((line=bf.readLine()) != null){
                System.out.println(line);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
