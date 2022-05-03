import java.awt.font.FontRenderContext;
import java.util.Arrays;

public class ReverseArray {

    /**
     * 11. Написать алгоритм ReverseArray, который принимает на вход массив
     * целых чисел, и возвращает “перевернутый” массив.
     * Test Data:
     * {2, 7, 3, 10} → {10, 3, 7, 2}
     */

    public int[] reverseArray(int[] input) {

        int[] output = new int[input.length];

        if (input.length == 0) {

            return output;
        } else {
            for (int i = 0; i < input.length; i++) {
                output[i] = input[input.length - i - 1];
            }

            return output;
        }
    }
}
