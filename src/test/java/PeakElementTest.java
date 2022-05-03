import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class PeakElementTest {

    /**
     * 10.	Написать алгоритм PeakElement,  который принимает на вход
     * массив целых чисел и возвращает значения пиковых элементов
     * (элементы, которые больше своих соседей).
     * Test Data:
     * {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
     */

    @Order(1)
    @Test
    public void testPeakElementHappyPathPositive() {
        int[] array = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};

        PeakElement pEl = new PeakElement();

        Assertions.assertArrayEquals(expectedResult, pEl.peakElement3(array));
    }

    @Order(2)
    @Test
    public void testPeakElementHappyPathNegative() {
        int[] array = {-3, -2, -7, -5, -1, -9, -23, -1};
        int[] expectedResult = {-2, -1, -1};

        PeakElement pEl = new PeakElement();

        Assertions.assertArrayEquals(expectedResult, pEl.peakElement3(array));
    }

    @Order(3)
    @Test
    public void testPeakElementHappyPathPositiveAndNegative() {
        int[] array = {-3, 2, -7, 5, -1, 9, 23, -1};
        int[] expectedResult = {2, 5, 23};

        PeakElement pEl = new PeakElement();

        Assertions.assertArrayEquals(expectedResult, pEl.peakElement3(array));
    }

    @Order(4)
    @Test
    public void testPeakElementHappyPathEmptyArray() {
        int[] array = {};
        int[] expectedResult = {};

        PeakElement pEl = new PeakElement();

        Assertions.assertArrayEquals(expectedResult, pEl.peakElement3(array));
    }

    @Order(5)
    @Test
    public void testPeakElementHappyPathOneElement() {
        int[] array = {65};
        int[] expectedResult = {};

        PeakElement pEl = new PeakElement();

        Assertions.assertArrayEquals(expectedResult, pEl.peakElement3(array));
    }

    @Order(6)
    @Test
    public void testPeakElementHappyPathTwoElements() {
        int[] array = {65, 85};
        int[] expectedResult = {85};

        PeakElement pEl = new PeakElement();

        Assertions.assertArrayEquals(expectedResult, pEl.peakElement3(array));
    }

    @Order(7)
    @Test
    public void testPeakElementHappyPathThreeElements() {
        int[] array = {65, 85, 74};
        int[] expectedResult = {85};

        PeakElement pEl = new PeakElement();

        Assertions.assertArrayEquals(expectedResult, pEl.peakElement3(array));
    }


}
