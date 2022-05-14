public class StringToLetters {

    /**
     * Написать 4 алгоритма StringToLetters, StringToLettersAndSpaces,
     * StringToNumbers, StringToNumbersAndSpaces следуя примеру на сайте:
     * https://allcalc.ru/node/2030
     * Каждый алгоритм принимает строку,  и удаляет ненужные символы:
     * "452dcvdbfd78562,/ /.{8654123 wedvfbg"
     * удалить все кроме букв
     */

    public static String stringToLetters(String str) {

        if (str != null) {
            if (!str.isEmpty()) {
                String result = "";
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) >= 65 || str.charAt(i) <= 90
                            && str.charAt(i) >= 97 || str.charAt(i) <= 122) {
                        result = str.indexOf(str.charAt(i)) + result;

                    } else {
                        str = str.replace(str.charAt(i), ' ');
                        str = str.replace(" ", "");
                    }
                }

                return str;
            }

            return "";
        }

        return "";

    }

    public static void main(String[] args) {

        String str = "452dcvdbfd78562,/ /.{8654123 wedvfbg";

        System.out.println(stringToLetters(str));


    }
}
