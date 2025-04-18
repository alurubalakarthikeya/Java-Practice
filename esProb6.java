import java.util.*;
public class esProb6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Sum of n numbers */
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0; i<=n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
