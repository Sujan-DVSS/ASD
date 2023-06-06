import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            if(num < 0){
                System.out.println(false);
                System.exit(0);
            }
            int tempNum = num;
            int res = 0;
            while(tempNum > 0){
                int digit = tempNum%10;
                res = res*10 + digit;
                tempNum /= 10;
            }
            if(num >= 0){
                if(Integer.valueOf(num).equals(Integer.valueOf(res)))
                    System.out.println(true);
                else
                    System.out.println(false);
            }
        }
    }   
}
