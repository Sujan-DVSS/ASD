package OOPS;

public class Example {

    public int number;

    public int add(){
        number += 5;
        return number;
    }

    private void printNum(){
        System.out.println(number);
    }

    public static void main(String[] args) {
        Example e = new Example();
        e.number = 5;
        Example2 e2 = new Example2();
        e2.number = 5;
        e.add(); // 
        e2.add();
        e.printNum(); // 10
        e2.printNum(); // 15
    }
    
}
