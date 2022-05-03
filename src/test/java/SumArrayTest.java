import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class SumArrayTest {

    /**
     * 3. Написать алгоритм SumArray,
     * который возвращает сумму всех чисел массива     *
     * Test Data:
     *  → 15
     *  → -10
     */

    @Order(1)
    @Test
    public void testSumArrayHappyPathPositive() {

        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray sumArr = new SumArray();

        Assertions.assertEquals(expectedResult, sumArr.sumArray(array));
    }

    @Order(2)
    @Test
    public void testSumArrayHappyPathNegative() {

        int[] array = {-7, -3};
        int expectedResult = -10;

        SumArray sumArr = new SumArray();

        Assertions.assertEquals(expectedResult, sumArr.sumArray(array));
    }

    @Order(3)
    @Test
    public void testSumArrayHappyPathPositiveAndNegative() {

        int[] array = {25, 3, 4, -15};
        int expectedResult = 17;

        SumArray sumArr = new SumArray();

        Assertions.assertEquals(expectedResult, sumArr.sumArray(array));
    }

    @Order(4)
    @Test
    public void testSumArrayHappyPathZero() {

        int[] array = {0, 0, 0, 0, 0, 0};
        int expectedResult = 0;

        SumArray sumArr = new SumArray();

        Assertions.assertEquals(expectedResult, sumArr.sumArray(array));
    }

    @Order(5)
    @Test
    public void testSumArrayHappyPathAllNumEqalsPositive() {

        int[] array = {25, 25, 25, 25};
        int expectedResult = 100;

        SumArray sumArr = new SumArray();

        Assertions.assertEquals(expectedResult, sumArr.sumArray(array));
    }

    @Order(6)
    @Test
    public void testSumArrayHappyPathAllNumEqalsNegative() {

        int[] array = {-25, -25, -25, -25};
        int expectedResult = -100;

        SumArray sumArr = new SumArray();

        Assertions.assertEquals(expectedResult, sumArr.sumArray(array));
    }

    @Order(7)
    @Test
    public void testSumArrayHappyPathOneNumIntMaxValue() {

        int[] array = {1, 1, 2147483647, 1};
        int expectedResult = 2147483647 + 3;

        SumArray sumArr = new SumArray();

        Assertions.assertEquals(expectedResult, sumArr.sumArray(array));
    }

    @Order(8)
    @Test
    public void testSumArrayHappyPathOneNumIntMinValue() {

        int[] array = {-1, -1, -2147483648, -1};
        int expectedResult = -2147483648 - 3;

        SumArray sumArr = new SumArray();

        Assertions.assertEquals(expectedResult, sumArr.sumArray(array));
    }
}
