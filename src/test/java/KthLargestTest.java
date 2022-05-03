import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class KthLargestTest {

    /**
     * 13. Написать алгоритм KthLargest, который принимает на вход
     * массив целых чисел и число k, и возвращает k-тый максимальный элемент.
     * Test Data:
     * ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 3) → 9
     *  (12 и 12 - первый и второй самые большие элементы)
     */

    @Order(1)
    @Test
    public void testKthLargestHappyPathPositive() {
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 3;
        int expectedResult = 9;

        KthLargest kLarge = new KthLargest();

        Assertions.assertEquals(expectedResult,
                kLarge.kthLargestAlgorithm2(array, k)
        );
    }

    @Order(2)
    @Test
    public void testKthLargestHappyPathNegative() {
        int[] array = {-4, -3, -7, -12, -5, -2, -9, -4, -12};;
        int k = 3;
        int expectedResult = -4;

        KthLargest kLarge = new KthLargest();

        Assertions.assertEquals(expectedResult,
                kLarge.kthLargestAlgorithm2(array, k)
        );
    }

    @Order(3)
    @Test
    public void testKthLargestHappyPathPositiveAndNegative() {
        int[] array = {-4, 3, 7, -12, -5, 2, -9, 4, 12};
        int k = 3;
        int expectedResult = 4;

        KthLargest kLarge = new KthLargest();

        Assertions.assertEquals(expectedResult,
                kLarge.kthLargestAlgorithm2(array, k)
        );
    }

    @Order(4)
    @Test
    public void testKthLargestEmptyArray() {
        int[] array = {};
        int k = 3;
        int expectedResult = -2147483648;

        KthLargest kLarge = new KthLargest();

        Assertions.assertEquals(expectedResult,
                kLarge.kthLargestAlgorithm2(array, k)
        );
    }

    @Order(5)
    @Test
    public void testKthLargestKZero() {
        int[] array = {-4, 3, 7, -12, -5, 2, -9, 4, 12};
        int k = 0;
        int expectedResult = -2147483648;

        KthLargest kLarge = new KthLargest();

        Assertions.assertEquals(expectedResult,
                kLarge.kthLargestAlgorithm2(array, k)
        );
    }

    @Order(6)
    @Test
    public void testKthLargestKLessZero() {
        int[] array = {-4, 3, 7, -12, -5, 2, -9, 4, 12};
        int k = -3;
        int expectedResult = -2147483648;

        KthLargest kLarge = new KthLargest();

        Assertions.assertEquals(expectedResult,
                kLarge.kthLargestAlgorithm2(array, k)
        );
    }
}
