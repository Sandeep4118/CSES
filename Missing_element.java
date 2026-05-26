// find the missing number
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n-1];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        long sum = 0;
        for(int i = 1; i<=n; i++){
            sum += i;
        }
        long actualsum = 0;
        for(int i= 0; i<arr.length; i++){
            actualsum += arr[i];
        }
        System.out.println(sum - actualsum);
   
    }
}