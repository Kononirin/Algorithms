import java.util.Arrays;

public class NegativeOnTheRight {

    /**
     * 13.2 Написать алгоритм NegativeOnTheRight, который принимает на вход
     * массив целых чисел, и возвращает массив,  в котором все негативные
     * числа находятся во второй половине массива
     * Test Data:
     * {4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}
     */

    public int[] negativeOnTheRight(int[] array) {

        if (array.length == 0) {

            return new int[]{};
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < 0) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

//    public static void main(String[] args) {
//
//        int[] arr = {4, -3, 7, -12, 5, -2, 9, 4, 12};
//
//        System.out.println(Arrays.toString(negativeOnTheRight(arr)));
//
//    }
}
