import java.util.Scanner;
/*Считывает из консоли число N — количество строк массива (считай, что это число будет больше 0, можно не проверять).
        Считывает N чисел из консоли (любые числа, которые будут больше 0, можно не проверять).
        Инициализирует двумерный массив multiArray:
        количеством строк N;
        строки — массивами, размер которых соответствует числам, введенным в п.2 (в порядке ввода).*/

public class CreatingTwoDimensionalArray {
    public static int[][] multiArray;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int size = Integer.parseInt(scan.nextLine());
            multiArray[i] = new int[size];
        }

    }
}
