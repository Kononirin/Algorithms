import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IntersectionTest {

    /**
     * 9. 	Написать алгоритм Intersection, который принимает на вход 2
     * массива целых чисел и возвращает массив общих элементов.
     * Test Data:
     * {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
     * {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
     * {1, 2, 4, 5, 89}, {8, 9, 45} → {}
     */

    @Order(1)
    @Test
    public void testIntersectionHappyPathPositive() {
        int[] a = {1, 2, 4, 5, 89};
        int[] b = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};

        Intersection inter = new Intersection();

        Assertions.assertArrayEquals(
                expectedResult, inter.intersectionAlgorithm(a,b)
        );
    }

    @Order(2)
    @Test
    public void testIntersectionHappyPathPositiveAndNegative() {
        int[] a = {1, 2, 4, 5, 8, 9};
        int[] b = {8, 9, -4, -2};
        int[] expectedResult = {8, 9};

        Intersection inter = new Intersection();

        Assertions.assertArrayEquals(
                expectedResult, inter.intersectionAlgorithm(a,b)
        );
    }

    @Order(3)
    @Test
    public void testIntersectionNotIntersection() {
        int[] a = {1, 2, 4, 5, 89};
        int[] b = {8, 9, 45};
        int[] expectedResult = {};

        Intersection inter = new Intersection();

        Assertions.assertArrayEquals(
                expectedResult, inter.intersectionAlgorithm(a,b)
        );
    }





}
