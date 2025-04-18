import java.util.Arrays;
public class midProb4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        System.out.println(Arrays.toString(arr));
    }
}
