import java.util.*;
public class midProb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        for(int i=n; i>0; i--){
            System.out.print(arr[i-1]);
        }
    }
}
