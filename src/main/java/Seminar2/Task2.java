package Seminar2;

import java.util.Arrays;

/**
 * Обработайте возможные исключительные ситуации. "Битые" значения
 * в исходном массиве считайте нулями. Можно внести в код правки,
 * которые считаете необходимыми
 */
public class Task2 {
    public static void main(String[] args) {
        String[][] arr0 = new String[][] {
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"}
        };

        String[][] arr = new String[][] {
                {"1", "1"},                    // {1,1,0,0,0}
                {"1", "1", "1", "1", "1"},
                {"1", "2"},
                {"3", "3"},
                {"2", "6"}
        };
       sum2d(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

    }

    private static int sum2d(String[][] arr) {
        int sum = 0;
      //
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {

                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
        }catch (ArrayIndexOutOfBoundsException e){
            arr = copyArr(arr);
        }

        return sum;
    }

    private static String[][] copyArr(String[][] arr){
        int length = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length < length){
                String[] temp = new String[length];
                System.arraycopy(arr[i],0,temp,0,arr[i].length);
                for (int j = arr[i].length; j < length; j++) {
                    temp[j] = "0";
                }
                arr[i] = temp;
            }
        }
        return arr;
    }
}