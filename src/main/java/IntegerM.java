public class IntegerM {

    /**
     * 7. Given an integer M perform the following conditional actions:
     * If M is multiple of 3 and 5 then return "Good Number".
     * If M is only multiple of 3 and not of 5 then return "Bad Number"
     * If M is only multiple of 5 and not of 3 then return "Poor Number"
     * If M doesn't satisfy any of the above conditions then return "-1"
     */

    public String IntegerM(Integer m) {

        if (m % 3 == 0 && m % 5 == 0) {

            return "Good Number";
        }
        if (m % 3 == 0 && m % 5 != 0) {

            return "Bad Number";
        }
        if (m % 3 != 0 && m % 5 == 0) {

            return "Poor Number";
        } else {

            return "-1";
        }
    }

    public static void main(String[] args) {

        int zero = 0;
        int a = 0 % 3;
        int b = 0 % 5;
        int c = 2147483647 + 1;
        int d = -2147483648 - 1;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int cfive = c % 5;
        int cthree = c % 3;
        int dfive = d % 5;
        int dthree = d % 3;
        int min3 = min % 3;
        int min5 = min % 5;
        int max3 = max % 3;
        int max5 = max % 5;

        System.out.println(a);
        System.out.println(b);
        System.out.println("c : " + c);
        System.out.println("d : " + d);
        System.out.println(max);
        System.out.println(min);
        System.out.println(max3);
        System.out.println(min3);
        System.out.println(max5);
        System.out.println(min5);
        System.out.println(cfive);
        System.out.println(cthree);
        System.out.println(dfive);
        System.out.println(dthree);
    }
}
