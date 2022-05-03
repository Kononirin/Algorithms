import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ReverseArrayTest {

    ReverseArray ra = new ReverseArray();

    /**
     *  11. Написать алгоритм ReverseArray, который принимает на вход
     *  массив целых чисел, и возвращает “перевернутый” массив.
     * Test Data:
     * {2, 7, 3, 10} → {10, 3, 7, 2}
     */

    @Order(1)
    @Test
    public void testReverseArrayHappyPathPositive() {

        int[] array = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};

        ReverseArray revArr = new ReverseArray();

        Assertions.assertArrayEquals(
                expectedResult, revArr.reverseArray(array)
        );
    }

    @Order(2)
    @Test
    public void testReverseArrayHappyPathNegative() {

        int[] array = {-2, -7, -3, -10};
        int[] expectedResult = {-10, -3, -7, -2};

        ReverseArray revArr = new ReverseArray();

        Assertions.assertArrayEquals(
                expectedResult, revArr.reverseArray(array)
        );
    }

    @Order(3)
    @Test
    public void testReverseArrayHappyPathZero() {

        int[] array = {0, 0, 0, 0};
        int[] expectedResult = {0, 0, 0, 0};

        ReverseArray revArr = new ReverseArray();

        Assertions.assertArrayEquals(
                expectedResult, revArr.reverseArray(array)
        );
    }

    @Order(4)
    @Test
    public void testReverseArrayHappyPathPositiveAndNegative() {

        int[] array = {26, 56, -78, -98, -74, 25};
        int[] expectedResult = {25, -74, -98, -78, 56, 26};

        ReverseArray revArr = new ReverseArray();

        Assertions.assertArrayEquals(
                expectedResult, revArr.reverseArray(array)
        );
    }

    @Order(5)
    @Test
    public void testReverseHappyPathOneElementPositive() {

        int[] array = {45};
        int[] expectedResult = {45};

        ReverseArray revArr = new ReverseArray();

        Assertions.assertArrayEquals(
                expectedResult, revArr.reverseArray(array)
        );
    }

    @Order(6)
    @Test
    public void testReverseHappyPathOneElementNegative() {

        int[] array = {-45};
        int[] expectedResult = {-45};

        ReverseArray revArr = new ReverseArray();

        Assertions.assertArrayEquals(
                expectedResult, revArr.reverseArray(array)
        );
    }

    @Order(7)
    @Test
    public void testReverseHappyPathTwoElementsNegative() {

        int[] array = {-45, -65};
        int[] expectedResult = {-65, -45};

        ReverseArray revArr = new ReverseArray();

        Assertions.assertArrayEquals(
                expectedResult, revArr.reverseArray(array)
        );
    }

    @Order(8)
    @Test
    public void testReverseHappyPathTwoElementsPositive() {

        int[] array = {45, 65};
        int[] expectedResult = {65, 45};

        ReverseArray revArr = new ReverseArray();

        Assertions.assertArrayEquals(
                expectedResult, revArr.reverseArray(array)
        );
    }

    @Order(9)
    @Test
    public void testReverseHappyPathOneNumIntMaxValue() {

        int[] array = {2147483647, 65};
        int[] expectedResult = {65, 2147483647};

        ReverseArray revArr = new ReverseArray();

        Assertions.assertArrayEquals(
                expectedResult, revArr.reverseArray(array)
        );
    }

    @Order(10)
    @Test
    public void testReverseHappyPathOneNumIntMinValue() {

        int[] array = {-2147483648, 65};
        int[] expectedResult = {65, -2147483648};

        ReverseArray revArr = new ReverseArray();

        Assertions.assertArrayEquals(
                expectedResult, revArr.reverseArray(array)
        );
    }

    @Order(11)
    @Test
    public void testReverseHappyPathOneNumMoreIntMaxValue() {

        int[] array = {2147483647 + 1, 65};
        int[] expectedResult = {65, 2147483647 + 1};

        ReverseArray revArr = new ReverseArray();

        Assertions.assertArrayEquals(
                expectedResult, revArr.reverseArray(array)
        );
    }

    @Order(12)
    @Test
    public void testReverseHappyPathOneNumLessIntMinValue() {

        int[] array = {-2147483648 - 1, 65};
        int[] expectedResult = {65, -2147483648 - 1};

        ReverseArray revArr = new ReverseArray();

        Assertions.assertArrayEquals(
                expectedResult, revArr.reverseArray(array)
        );
    }

    @Order(13)
    @Test
    public void testReverseArrayEmptyArray() {

        int[] array = {};
        int[] expectedResult = {};

        ReverseArray revArr = new ReverseArray();

        Assertions.assertArrayEquals(
                expectedResult, revArr.reverseArray(array)
        );
    }





}
