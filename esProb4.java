import java.util.*;
public class esProb4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /* Print all even numbers from 1 to n */
        int n = sc.nextInt();
        for(int i=2; i<=n; i+=2){
                System.out.println(i+" ");
        }
    }
}
