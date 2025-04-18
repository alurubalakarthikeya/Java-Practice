import java.util.*;
public class esProb5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Print multiplication table of n */
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.print(n*i+",");
        }
    }
}
