import java.util.Scanner;
public class TheSecondMinimumNumberOfTheEntered {
    public static void main(String[] args) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextInt()) {
            int tmp = scan.nextInt();
            if (tmp < min1) {
                min2 = min1;
                min1 = tmp;
            } else if (tmp > min1 && tmp < min2) {
                min2 = tmp;
            }
        }

        System.out.println(min2);
    }
}
