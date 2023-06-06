import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            boolean isNegative = false;
            if(n < 0){
                isNegative = true;
                n *= -1;
            }
            long res = 0;
            while(n > 0){
                int digit = n%10;
                res = res*10 + digit;
                n /= 10;
            }
            if(res > Integer.MAX_VALUE) System.out.println(0);
            if(isNegative) res *= -1L; 
            System.out.println((int)res);
        }
    }
   
    
}
