import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToNumbersTest {

    /**
     * Написать алгоритм StringToNumbers, который принимает строку, и
     * возвращает массив чисел:
     * Test Data:
     * “1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
     * (Без форматирования)
     */

    @Order(1)
    @Test
    public void testStringToNumbersHappyPathPositive() {

        String str = "1, 2, 3, 4, 5";

        int[] expectedResult = {1, 2, 3, 4, 5};

        StringToNumbers strToNum = new StringToNumbers();

        Assertions.assertArrayEquals(expectedResult,
                strToNum.stringToNumbers(str)
        );
    }

    @Order(2)
    @Test
    public void testStringToNumbersHappyPathNegative() {

        String str = "-1, -2, -3, -4, -5";

        int[] expectedResult = {-1, -2, -3, -4, -5};

        StringToNumbers strToNum = new StringToNumbers();

        Assertions.assertArrayEquals(expectedResult,
                strToNum.stringToNumbers(str)
        );
    }

    @Order(3)
    @Test
    public void testStringToNumbersHappyPathPositiveAndNegative() {

        String str = "1, 2, -3, -4, -5";

        int[] expectedResult = {1, 2, -3, -4, -5};

        StringToNumbers strToNum = new StringToNumbers();

        Assertions.assertArrayEquals(expectedResult,
                strToNum.stringToNumbers(str)
        );
    }

    @Order(4)
    @Test
    public void testStringToNumbersHappyPathZeros() {

        String str = "0, 0, 0, 0, 0";

        int[] expectedResult = {0, 0, 0, 0, 0};

        StringToNumbers strToNum = new StringToNumbers();

        Assertions.assertArrayEquals(expectedResult,
                strToNum.stringToNumbers(str)
        );
    }
}
