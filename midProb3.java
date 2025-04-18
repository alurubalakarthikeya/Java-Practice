import java.util.*;
public class midProb3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int size = word.length()-1;
        for(int i=size; i>=0; i--){
            System.out.print(word.charAt(i));
        }
    }
}
