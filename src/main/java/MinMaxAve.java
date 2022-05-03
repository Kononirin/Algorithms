import java.util.Arrays;

public class MinMaxAve {

    /**
     * 8. Написать алгоритм MinMaxAve, который принимает массив чисел int[]
     * и 2 значения индексов. Алгоритм возвращает массив, который содержит
     * минимальное значение, максимальное значение,
     * и среднее среди всех значений между 2-мя индексами.
     * Test Data:
     * ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
     */

    public static int[] minMaxAve(int[] array, int start, int end) {

        if (array.length == 0 || start < 0
                || end > (array.length - 1) || start > end) {

            return new int[]{};
        }

        int[] newArray = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};

        for (int i = start; i <= end; i++) {
            if (array[i] < newArray[0]) {
                newArray[0] = array[i];
            }
            if (array[i] > newArray[1]) {
                newArray[1] = array[i];
            }
            newArray[2] = newArray[2] + array[i];
        }

        newArray[2] = newArray[2] / (end - start + 1);

        return newArray;
    }

    //вариант алгоритма, если старт больше энда, то поменять их местами
    public static int[] minMaxAve1(int[] array, int start, int end) {

        if (array.length <= 0 || start > (array.length - 1)
                || end > (array.length - 1) || end < 0 || start < 0) {

            return new int[]{};
        }

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        int[] newArray = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};

        for (int i = start; i <= end; i++) {
            if (array[i] < newArray[0]) {
                newArray[0] = array[i];
            }
            if (array[i] > newArray[1]) {
                newArray[1] = array[i];
            }
            newArray[2] = newArray[2] + array[i];
        }

        newArray[2] = newArray[2] / (end - start + 1);

        return newArray;
    }
}
