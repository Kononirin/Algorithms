import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class MinMaxAveTest {

    /**
     * 8. Написать алгоритм MinMaxAve, который принимает массив чисел int[]
     * и 2 значения индексов. Алгоритм возвращает массив, который содержит
     * минимальное значение, максимальное значение,
     * и среднее среди всех значений между 2-мя индексами.     *
     * Test Data:
     * ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
     */

    @Order(1)
    @Test
    public void testMinMaxAveHappyPathPositive() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 2;
        int end = 6;
        int[] expectedResult = {3, 7, 5};

        MinMaxAve mma = new MinMaxAve();

        Assertions.assertArrayEquals(
                expectedResult, mma.minMaxAve(array, start, end)
        );
    }

    @Order(2)
    @Test
    public void testMinMaxAveHappyPathNegative() {

        int[] array = {-1, -2, -3, -4, -5, -6, -7, -8};
        int start = 2;
        int end = 6;
        int[] expectedResult = {-7, -3, -5};

        MinMaxAve mma = new MinMaxAve();

        Assertions.assertArrayEquals(
                expectedResult, mma.minMaxAve(array, start, end)
        );
    }

    @Order(3)
    @Test
    public void testMinMaxAveHappyPathPositiveNegative() {

        int[] array = {1, 2, 3, 4, -5, -6, -7, -8};
        int start = 2;
        int end = 6;
        int[] expectedResult = {-7, 4, -2};

        MinMaxAve mma = new MinMaxAve();

        Assertions.assertArrayEquals(
                expectedResult, mma.minMaxAve(array, start, end)
        );
    }

    @Order(4)
    @Test
    public void testMinMaxAveHappyPathZero() {

        int[] array = {0, 0, 0, 0, 0, 0, 0, 0};
        int start = 2;
        int end = 6;
        int[] expectedResult = {0, 0, 0};

        MinMaxAve mma = new MinMaxAve();

        Assertions.assertArrayEquals(
                expectedResult, mma.minMaxAve(array, start, end)
        );
    }

    @Order(5)
    @Test
    public void testMinMaxAveHappyPathAllNumsEquals() {

        int[] array = {56, 56, 56, 56, 56, 56, 56, 56};
        int start = 2;
        int end = 6;
        int[] expectedResult = {56, 56, 56};

        MinMaxAve mma = new MinMaxAve();

        Assertions.assertArrayEquals(
                expectedResult, mma.minMaxAve(array, start, end)
        );
    }


    @Order(6)
    @Test
    public void testMinMaxAveEmptyArray() {

        int[] array = {};
        int start = 2;
        int end = 6;
        int[] expectedResult = {};

        MinMaxAve mma = new MinMaxAve();

        Assertions.assertArrayEquals(
                expectedResult, mma.minMaxAve(array, start, end)
        );
    }

    @Order(7)
    @Test
    public void testMinMaxAveStartMoreEnd() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 6;
        int end = 2;
        int[] expectedResult = {};

        MinMaxAve mma = new MinMaxAve();

        Assertions.assertArrayEquals(
                expectedResult, mma.minMaxAve(array, start, end)
        );
    }

    @Order(8)
    @Test
    public void testMinMaxAveStartLessZero() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = -2;
        int end = 6;
        int[] expectedResult = {};

        MinMaxAve mma = new MinMaxAve();

        Assertions.assertArrayEquals(
                expectedResult, mma.minMaxAve(array, start, end)
        );
    }

    @Order(9)
    @Test
    public void testMinMaxAveEndMoreArrayLength() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 2;
        int end = 9;
        int[] expectedResult = {};

        MinMaxAve mma = new MinMaxAve();

        Assertions.assertArrayEquals(
                expectedResult, mma.minMaxAve(array, start, end)
        );
    }

    @Order(10)
    @Test
    public void testMinMaxAveOneNumMaxValue() {

        int[] array = {1, 2, 3, 2147483647, 5, 6, 7, 8};
        int start = 2;
        int end = 9;
        int[] expectedResult = {3, 2147483647, 429496734};

        MinMaxAve mma = new MinMaxAve();

        Assertions.assertArrayEquals(
                expectedResult, mma.minMaxAve(array, start, end)
        );
    }

    @Order(11)
    @Test
    public void testMinMaxAveOneNumMoreMaxValue() {

        int[] array = {1, 2, 3, 2147483647 + 1, 5, 6, 7, 8};
        int start = 2;
        int end = 9;
        int[] expectedResult = {3, 2147483647 + 1, 429496734};

        MinMaxAve mma = new MinMaxAve();

        Assertions.assertArrayEquals(
                expectedResult, mma.minMaxAve(array, start, end)
        );
    }

    @Order(12)
    @Test
    public void testMinMaxAveOneNumMinValue() {

        int[] array = {-1, -2, -3, -2147483648, -5, -6, -7, -8};
        int start = 2;
        int end = 9;
        int[] expectedResult = {-2147483648, -3, -429496730};

        MinMaxAve mma = new MinMaxAve();

        Assertions.assertArrayEquals(
                expectedResult, mma.minMaxAve(array, start, end)
        );
    }

    @Order(13)
    @Test
    public void testMinMaxAveOneNumLessMinValue() {

        int[] array = {-1, -2, -3, -2147483648 - 1, -5, -6, -7, -8};
        int start = 2;
        int end = 9;
        int[] expectedResult = {-2147483648 - 1, -3, -429496730};

        MinMaxAve mma = new MinMaxAve();

        Assertions.assertArrayEquals(
                expectedResult, mma.minMaxAve(array, start, end)
        );
    }

    @Order(14)
    @Test
    public void testMinMaxAveOneElement() {

        int[] array = {3};
        int start = 0;
        int end = 0;
        int[] expectedResult = {3, 3, 3};

        MinMaxAve mma = new MinMaxAve();

        Assertions.assertArrayEquals(
                expectedResult, mma.minMaxAve(array, start, end)
        );
    }

    @Order(15)
    @Test
    public void testMinMaxAveStartLessEnd() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 6;
        int end = 2;
        int[] expectedResult = {3, 7, 5};

        MinMaxAve mma = new MinMaxAve();

        Assertions.assertArrayEquals(
                expectedResult, mma.minMaxAve1(array, start, end)
        );
    }
}
