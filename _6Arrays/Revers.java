import java.util.Scanner;
import java.util.Arrays;
public class Revers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        if(n%2 == 0){
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[args.length - i - 1]);
            }
        }
        else {
            for (int x : arr) {
                System.out.println(x);
            }
        }
    }



}
