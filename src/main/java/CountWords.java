public class CountWords {

    /**
     * 17. Напишите алгоритм CountWords, который принимает на вход текст и
     * слово, и считает все вариации этого слова в тексте:
     * “As of March 2022, Java 18 is the latest version, while Java 17,
     * 11 and 8 are the current long-term support (LTS) versions. Oracle
     * released the last zero-cost public update for the legacy version Java 8
     * LTS in January 2019 for commercial java use, although it will otherwise
     * still support Java 8 with public updates for personal use indefinitely.
     * Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11
     * that are still receiving security and other upgrades.”, “Java” → 5
     */

    public static int countWords(String text, String str) {
        text = text.toLowerCase();
        str = str.toLowerCase();
        int count = 1;
        int index = text.indexOf(str);
        for (int i = index+(str.length()-1); i < text.length(); i++) {
            if (text.contains(str)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String text = "As of March 2022, Java 18 is the latest version, "
                + "while Java 17, 11 and 8 are the current long-term support "
                + "(LTS) versions. Oracle released the last zero-cost public "
                + "update for the legacy version Java 8 LTS in January 2019 "
                + "for commercial java use, although it will otherwise still "
                + "support Java 8 with public updates for personal use "
                +"indefinitely. Other vendors have begun to offer zero-cost "
                + "builds of OpenJDK 8 and 11 that are still receiving security"
                + " and other upgrades.";

        String str = "Java";

//        int index = text.indexOf(str);
//        System.out.println(index);
//        int index1 = text.indexOf(str, index + (str.length() - 1));
//        System.out.println(index1);
//        int index2 = text.indexOf(str, index1 + (str.length() - 1));
//        System.out.println(index2);
//        int index3 = text.indexOf(str, index2 + (str.length() - 1));
//        System.out.println(index3);
//        int index4 = text.indexOf(str, index3 + (str.length() - 1));
//        System.out.println(index4);
//        int index5 = text.indexOf(str, index4 + (str.length() - 1));
//        System.out.println(index5);
//        int index6 = text.indexOf(str, index5 + (str.length() - 1));
//        System.out.println(index6);

        System.out.println(countWords(text, str));

    }
}
