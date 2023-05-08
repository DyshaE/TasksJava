import java.util.Arrays;

public class CombiningArrays {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;
    public static void main(String[] args) {
        resultArray = new int[firstArray.length + firstArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
        }
        for (int i = firstArray.length; i < resultArray.length; i++) {
            resultArray[i] = secondArray[i - firstArray.length];
        }
        System.out.println(Arrays.toString(resultArray));
    }
}
