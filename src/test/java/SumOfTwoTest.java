import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SumOfTwoTest {

    /**
     * 14.	Написать алгоритм SumOfTwo, который принимает на вход
     * массив целых чисел, и число n. Алгоритм  возвращает
     * пары элементов, которые в сумме дают число n.
     * Test Data:
     * ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}
     */

    @Order(1)
    @Test
    public void testSumOfTwoHappyPathPositive () {
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int n = 12;
        int[][] expectedResult = {{3, 9}, {7, 5}};

        SumOfTwo sumTwo = new SumOfTwo();

        Assertions.assertArrayEquals(
                expectedResult, sumTwo.sumOfTwoAlgoritm2(array, n)
        );
    }

    @Order(2)
    @Test
    public void testSumOfTwoHappyPathNegative () {
        int[] array = {-4, -3, -7, -12, -5, -2, -9, -4, -12};
        int n = -12;
        int[][] expectedResult = {{-3, -9}, {-7, -5}};

        SumOfTwo sumTwo = new SumOfTwo();

        Assertions.assertArrayEquals(
                expectedResult, sumTwo.sumOfTwoAlgoritm2(array, n)
        );
    }

    @Order(3)
    @Test
    public void testSumOfTwoHappyPathPostiveAndNegative () {
        int[] array = {-4, 3, 7, -12, -5, 2, -9, 4, 12};
        int n = 12;
        int[][] expectedResult = {};

        SumOfTwo sumTwo = new SumOfTwo();

        Assertions.assertArrayEquals(
                expectedResult, sumTwo.sumOfTwoAlgoritm2(array, n)
        );
    }

    @Order(4)
    @Test
    public void testSumOfTwoNZero () {
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int n = 0;
        int[][] expectedResult = {};

        SumOfTwo sumTwo = new SumOfTwo();

        Assertions.assertArrayEquals(
                expectedResult, sumTwo.sumOfTwoAlgoritm2(array, n)
        );
    }
}
