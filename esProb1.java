import java.util.*;
public class esProb1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /* Print all the numbers within in the range */
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for(int i=num1; i<=num2; i++){
            System.out.println(i+" ");
        }
    }
}
