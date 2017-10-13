package firstDay;

public class pirmaspvz {
    private  int value;
    private int secondValue;
    public static  void main (String[]args){
       pirmaspvz pirmaspvz= new pirmaspvz();
        pirmaspvz.value=12;
        pirmaspvz.secondValue=30;

       System.out.println(pirmaspvz.sum());// isvedimAS i konsole
        pirmaspvz.testPrivate();// statinis kviecia nestatini per objekto varda
    }
    public int sum(){
        test();
        testPrivate();// tiesiogiai galima
        return  value + secondValue;

    }
    public static  int test(){
        // sum(); neglaimas
        return 0;
    }
    private void testPrivate(){
        System.out.println("testas");
    }
}
