import java.util.Arrays;
import java.util.Scanner;

public class DeletingTheSameLines {
    public static String[] strings;
    public static void main(String[] args) {
        //Считать 6 строк и заполнить ими массив strings.
        //Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
        Scanner scan = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < 6; i++) {
            strings[i] = scan.nextLine();
        }
        String[] clone = Arrays.copyOf(strings, 6);
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (clone[i].equals(strings[j]) & clone[i] != null){
                    strings[i] = null;
                    strings[j] = null;
                }
            }

        }

        for (int i = 0; i < strings.length; i++) {
            String current = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (current == null){
                    break;
                }
                if (current.equals(strings[j])){
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }



        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }

    }
}
