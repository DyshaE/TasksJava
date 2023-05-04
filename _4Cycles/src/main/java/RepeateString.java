import java.util.Scanner;
public class RepeateString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int number = scan.nextInt();

        do{
            System.out.println(str);
            number--;
        }while(number > 0 && number < 4);
    }
}
