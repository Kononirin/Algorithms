import java.util.Arrays;

public class SortArray {

    /**
     * 12. Написать алгоритм SortArray, который принимает на вход массив
     * целых чисел, и сортирует элементы массива в порядке возрастания.
     * Test Data:
     * {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}
     */

    public int[] sortArray(int[] array) {

        if (array.length != 0) {

            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }

            return array;
        }

        return new int[]{};
    }
}
