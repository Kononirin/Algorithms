import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SortArrayTest {

    /**
     * 12. Написать алгоритм SortArray, который принимает на вход массив
     * целых чисел, и сортирует элементы массива в порядке возрастания.
     * Test Data:
     * {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}
     */

    @Order(1)
    @Test
    public void testSortArrayHappyPathPositive() {
        int[] positive = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        SortArray sortAr = new SortArray();

        Assertions.assertArrayEquals(
                expectedResult, sortAr.sortArray(positive)
        );
    }

    @Order(2)
    @Test
    public void testSortArrayHappyPathPositiveAndNegative() {
        int[] positive = {4, 3, 7, 12, -5, 2, 9, -4, 12};
        int[] expectedResult = {-5, -4, 2, 3, 4, 7, 9, 12, 12};

        SortArray sortAr = new SortArray();

        Assertions.assertArrayEquals(
                expectedResult, sortAr.sortArray(positive)
        );
    }

    @Order(3)
    @Test
    public void testSortArrayHappyPathPositiveNegativeZero() {

        int[] positive = {-4, -3, -7, 12, -5, -2, -9, -4, -12, 0, 0};
        int[] expectedResult = {-12, -9, -7, -5, -4, -4, -3, -2, 0, 0, 12};

        SortArray sortAr = new SortArray();

        Assertions.assertArrayEquals(
                expectedResult, sortAr.sortArray(positive)
        );
    }

    @Order(4)
    @Test
    public void testSortArrayHappyPathZero() {

        int[] positive = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] expectedResult = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        SortArray sortAr = new SortArray();

        Assertions.assertArrayEquals(
                expectedResult, sortAr.sortArray(positive)
        );
    }

    @Order(5)
    @Test
    public void testSortArrayHappyPathNegative() {

        int[] positive = {-95, -56, -47, -123, -1};
        int[] expectedResult = {-123, -95, -56, -47, -1};

        SortArray sortAr = new SortArray();

        Assertions.assertArrayEquals(
                expectedResult, sortAr.sortArray(positive)
        );
    }

    @Order(6)
    @Test
    public void testSortArrayHappyPathOneNumIntMaxValue() {

        int[] positive = {95, 56, 2147483647, -123, -1};
        int[] expectedResult = {-123, -1, 56, 95, 2147483647};

        SortArray sortAr = new SortArray();

        Assertions.assertArrayEquals(
                expectedResult, sortAr.sortArray(positive)
        );
    }

    @Order(7)
    @Test
    public void testSortArrayHappyPathOneNumIntMinValue() {

        int[] positive = {95, 56, -2147483648, -123, -1};
        int[] expectedResult = {-2147483648, -123, -1, 56, 95};

        SortArray sortAr = new SortArray();

        Assertions.assertArrayEquals(
                expectedResult, sortAr.sortArray(positive)
        );
    }

    @Order(8)
    @Test
    public void testSortArrayEmptyArray() {

        int[] positive = {};
        int[] expectedResult = {};

        SortArray sortAr = new SortArray();

        Assertions.assertArrayEquals(
                expectedResult, sortAr.sortArray(positive)
        );
    }

    @Order(9)
    @Test
    public void testSortArrayOneNumMoreIntMaxValue() {

        int[] positive = {951, 25, 1, 2147483647 + 1};
        int[] expectedResult = {1, 25, 951, 2147483647 + 1};

        SortArray sortAr = new SortArray();

        Assertions.assertArrayEquals(
                expectedResult, sortAr.sortArray(positive)
        );
    }

    @Order(10)
    @Test
    public void testSortArrayOneNumLessIntMinValue() {

        int[] positive = {951, 25, 1, - 2147483648 - 1};
        int[] expectedResult = {- 2147483648 - 1, 1, 25, 951, };

        SortArray sortAr = new SortArray();

        Assertions.assertArrayEquals(
                expectedResult, sortAr.sortArray(positive)
        );
    }
}
