import java.util.*;
public class esProb8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Sum of digits of a number */
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
