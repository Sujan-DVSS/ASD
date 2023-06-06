import java.util.Scanner;

public class LCMandGCD {

    public static int GCD(int small, int large){
        if(small == 0) return large;
        return GCD(large%small, small);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int small = Math.min(a,b);
            int large = Math.max(a,b);

            int gcd = GCD(small,large);

            System.out.println(gcd);
            
            System.out.println((small*large) / (gcd));
        }
    }
    
}
