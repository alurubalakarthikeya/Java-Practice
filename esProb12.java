import java.util.*;
public class esProb12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Sum of squares from 1 to n */
        int n = sc.nextInt();
        int sum =0;
        for(int i=1; i<=n; i++){
            sum += i*i;
        }
        System.out.println(sum);
    }
}
