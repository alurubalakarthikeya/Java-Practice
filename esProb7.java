import java.util.*;
public class esProb7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Factorial of a number */
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
