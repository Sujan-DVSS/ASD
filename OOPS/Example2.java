package OOPS;

public class Example2 {
    public int number;

    public int add(){
        number += 10;
        return number;
    }
    public void printNum(){
        System.out.println(number);
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.getA(); // 5
        
    }
}
