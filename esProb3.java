import java.util.*;
public class esProb3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /* Print all odd numbers from 1 to n */
        int n = sc.nextInt();
        for(int i=1; i<=n; i+=2){
                System.out.println(i+" ");
        }
    }
}
