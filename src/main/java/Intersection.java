import java.util.Arrays;

public class Intersection {

    /**
     * 9. 	Написать алгоритм Intersection, который принимает на вход 2
     * массива целых чисел и возвращает массив общих элементов.
     * Test Data:
     * {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
     * {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
     * {1, 2, 4, 5, 89}, {8, 9, 45} → {}
     */

    public int[] intersectionAlgorithm(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    a[j] = -2147483648;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[i] == b[j]) {
                    b[j] = -2147483648;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[j] == a[i] && a[i] != -2147483648
                        && b[j] != -2147483648) {
                    count++;
                    break;
                }
            }
        }
        if (count == 0) {

            return new int[]{};
        } else {
            int[] result = new int[count];
            count = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (b[j] == a[i] && a[i] != -2147483648
                            && b[j] != -2147483648) {
                        result[count] = a[i];
                        count++;
                        break;
                    }
                }
            }

            return result;
        }
    }





//    public static void intersection(int[] arrOne, int[] arrTwo) {
//
//        int[] tempArr;
//
//        if (arrOne.length >= arrTwo.length) {
//            tempArr = new int[arrOne.length];
//        } else  {
//            tempArr = new int[arrTwo.length];
//        }
//
//
//        int count = 0;
//        boolean isHaveCopy;
//
//        for (int i = 0; i < arrOne.length; i++) {
//            for (int j = 0; j < arrTwo.length; j++) {
//                if (arrOne[i] == arrTwo[j]) {
//                    isHaveCopy = false;
//                    for (int k = 0; k < count; k++) {
//                        if (arrOne[i] == tempArr[k]) {
//                            isHaveCopy = true;
//                        }
//                        count++;
//                    }
//                }
//            }
//        }



//        if (arrOne.length == 0 && arrTwo.length == 0) {
//
//            return new int[] {};
//        }

//        int count = 0;
//
//        for (int i = 0; i < arrOne.length; i++) {
//            for (int j = 0; j < arrTwo.length; j++) {
//                if (arrOne[i] == arrTwo[j]) {
//
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//
//       int[] arrOverAll = new int[count];
//
//        for (int i = 0; i < arrOne.length; i++) {
//            for (int j = 0; j < arrTwo.length; j++) {
//                if (arrOne[i] == arrTwo[j]) {
//                    arrOverAll[i] = arrOne[i];
//                    System.out.print(arrOverAll[i] + " ");
//                }
//            }
//        }




//    public static void main(String[] args) {
//        int[] array1 =  {1, 4, 4, 5, 89};
//        int[] array2 = {8, 4, 9, 4, 2};
//
//        intersection(array1, array2);
//
//    }

}
