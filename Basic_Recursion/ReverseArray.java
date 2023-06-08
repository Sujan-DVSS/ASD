package Basic_Recursion;

import java.util.Scanner;

public class ReverseArray{

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        
    }

    static void reverseArray(int[] arr, int left, int right){
        if(left > right) return ;
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverseArray(arr, left+1, right-1);
    }
    public static void toString(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        reverseArray(arr,0,n-1);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
           }
      }
   }
}
