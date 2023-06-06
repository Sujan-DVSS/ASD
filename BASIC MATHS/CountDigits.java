
import java.util.*;

public class CountDigits{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int temp = N;
            int cnt = 0;

            while(N > 0){
                int digit = N%10;
                if(digit != 0 && temp%digit == 0 ) cnt += 1;

                N /= 10;
            }
            System.out.println(cnt);
        }
    }
}