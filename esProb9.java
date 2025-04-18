import java.util.*;
public class esProb9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Fibonacci series */
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=0; i<=n; i++){
            System.out.println(a+" ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
