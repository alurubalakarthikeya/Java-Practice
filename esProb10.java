import java.util.*;
public class esProb10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Count number of vowels in a word */
        String word = sc.next();
        int count = 0;
        for(char ch: word.toCharArray()){
            if("aeiouAEIOU".indexOf(ch)!= -1){
                count++;
            }
        }
        System.out.println(count);
    }
}
