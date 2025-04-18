import java.util.*;
public class midProb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Find the second largest element in the array */
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int large = 0;
        for(int i=0; i<n; i++){
            if(arr[i] > large){
                large = arr[i];
            }
        }
        int secondLarge = 0;
        for(int i=0; i<n; i++){
            if(arr[i] > secondLarge && arr[i]<large){
                secondLarge = arr[i];
            }
        }
        System.out.println(secondLarge);
    }
}
