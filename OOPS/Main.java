package OOPS;

 
// [ Access Specifier] [Static/non-static] [ Data Type] [ Variable Name / Method Name]

public class Main extends Object {

    private int a = 5;
    private static int b = 5;

    public int getA(){
        return a;
    }

    public int setA(int x){
        a = x;
        return a;
    }

    public int getB(){
        return b;
    }

    public int setB(int x){
        b = x;
        return b;
    }
    public static void main(String[] args) {      

        Main m1 = new Main();
        Main m2 = new Main();

        //set A for m1
        m1.setA(10);

        //setB for m1
        m1.setB(15);

        System.out.println(m1.getA());//10
        System.out.println(m2.getA());//5

        System.out.println(m1.getB());//15
        System.out.println(m2.getB());//15
/*--------------------------------------------------- */
        System.out.println(m1.setA(100));//100
        System.out.println(m2.setA(50));//50

        System.out.println(m1.setB(150));//150
        System.out.println(m2.getB());//150

    }
}
