package Basic_Recursion;

import java.util.Scanner;

public class PrintName {
    public static void printName(int count, String name){
        if(count == 0) return ;
        System.out.println(name);
        printName(count-1, name);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        String name = sc.nextLine();
        int count = sc.nextInt();
        printName(count,name);
        }
    }
}
