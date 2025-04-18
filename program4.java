import java.util.*;
/*  Solve the following problems using bitwise operators: 
  1. Check whether the number is odd or even
  2. Swap two numbers 
  3.Check whether the number is power of 2
  4. Check whether number in the given array is unique
  5. Find the position of only set bit
  6. Find the count of set bits
 */
class program4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
/*      1. Check whether the number is odd or even using bitwise operator
        int num = sc.nextInt();
        if((num&1)==1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        } */

      /*   2. Swap two numbers
       int a = sc.nextInt();
       int b = sc.nextInt();
       a = a^b;
       b = a^b;
       a = a^b;
       System.out.println("a: "+a);
       System.out.println("b: "+b);
        */

/*  
       3.Check whether the number is power of 2   
       int num = sc.nextInt();
       if((num&(num-1))==0){
              System.out.println("Power of 2");
         }else{
              System.out.println("Not a power of 2");
         } */

/*      4. Check whether number in the given array is unique 
        int arr[] = {1,2,1,3,2};
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            ans = ans^arr[i];
        }
        System.out.println(ans); */


/*         5. Find the position of only set bit
        int num = sc.nextInt();
        int count = 0;
        while((num&1)!=1 && num!=0){
            num = num >> 1;
            count++;
        }
        System.out.println(count); */

/*       6. Find the count of set bits   
        int num = sc.nextInt();
        int count = 0;
        while(num>0){
            if((num&1)==1){
                count++;
            }
        num = num >> 1;
        }
        System.out.println(count); */
    }
}

/* Bitwise operators:
 * 1. AND (&)
 * 2. OR (|)
 * 3. XOR (^)
 * 4. NOT (~)
 * 5. Left Shift (<<)
 * 6. Right Shift (>>)
 */