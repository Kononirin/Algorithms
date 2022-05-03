import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class NumberOccurrencesTest {

    /**
     * 15.	Написать алгоритм NumberOccurrences, который принимает на вход
     * массив целых чисел, и возвращает массив пар
     * {число, сколько раз число встречается в массиве}
     *  Test Data:
     * {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1} →
     * {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}}
     */

    @Test
    public void testNumberOccurrencesHappyPathPositive() {
        int[] array = {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};
        int[][]expectedResult = {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};

        NumberOccurrences numOc = new NumberOccurrences();

        Assertions.assertArrayEquals(
                expectedResult, numOc.numberOccurrencesAlgoritm(array)
        );
    }

}
