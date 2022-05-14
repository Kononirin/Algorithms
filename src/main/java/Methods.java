public class Methods {

    public static void main(String[] args) {

        /**
         * Math.abs
         * Math.floor
         * Math.ceil
         * Math.round
         * Math.min
         * Math.max
         * Math.pow
         * Math.random
         * Math.sqrt
         * xxxValue
         * compareTo()
         * length()
         * trim()
         * replace()
         * replaceAll()
         * isEmpty()
         * split()
         * indexOf()
         * lastIndexOf()
         * toLowerCase()
         * toUpperCase()
         * charAt()
         * concat()
         * substring()
         * contains()
         * valueOf()
         */



        /**
         * Методы класса Math помогают выполнять числовые операции, такие как
         * квадрат, квадратный корень, куб,
         * корень куба, экспоненциальные и тригонометрические операции.
         * Что такое аргумент NaN?
         * Константа, содержащая значение Not-a-Number (NaN) типа double.
         * Это эквивалентно значению, которое возвращает Double.longBitsToDouble
         * (0x7ff8000000000000L).
         * Метод abs (): java.lang.Math.abs () возвращает абсолютное значение
         * переданного аргумента любого типа.
         * Этот метод может обрабатывать все типы данных.
         * Особый случай :
         * Результат положительный ноль, если аргумент положительный ноль или
         * отрицательный ноль.
         * Результатом является положительная бесконечность, если аргумент
         * бесконечный.
         * Результат равен NaN, если переданный аргумент равен NaN.
         */

        System.out.println("Метод abs ()");

        int Vali = -1;

        float Valf = -0.7f;

        // Использование метода .abs () для получения absoluteValue

        int Absi = Math.abs(Vali);

        float Absf = Math.abs(Valf);

        System.out.println("Absolute value of int : " + Absi); // 1

        System.out.println("Absolute value of float : " + Absf); // 0.7

        System.out.println();

        /**
         * Метод floor (): java.lang.Math.floor () дает целое число с нулевой
         * дробной частью,
         * ближайшее к числу аргумента слева, другими словами — округляет дробь
         * в меньшую сторону.
         * Например: 101.23 имеет значение пола = 101.0
         * Важный момент: тот же аргумент приводится, если передан NaN или
         * бесконечный аргумент.
         *
         * Параметры
         * Примитивный тип данных double или float.
         * Возвращаемое значение : Math.floor() возвращает целое число, которое
         * ближайшее к числу аргумента слева.
         * Возвращается в виде double.
         */

        System.out.println("Метод floor ()");

        double f1 = 30.56, f2 = -56.34;

        f1 = Math.floor(f1);

        System.out.println("Floor value of f1 : " + f1); // 30.0

        f2 = Math.floor(f2);

        System.out.println("Floor value of f2 : " + f2); // -57.0

        System.out.println();

        /**
         * Метод Math.ceil() — дает целое число с нулевой дробной частью,
         * ближайшее к числу аргумента справа,
         * другими словами — округляет дробь в большую сторону.
         * Принимает примитивный тип данных double или float.
         * Math.ceil() возвращает целое число, которое ближайшее к числу
         * аргумента справа.
         * Возвращается в виде double.
         */

        // Использование метода ceil ()

        System.out.println("Метод Math.ceil()");

        double val = 30.56;

        double ceilval = Math.ceil(val);

        System.out.println("Ceil value of val : " + ceilval); // 31.0

        System.out.println();

        /**
         * Math.round() — возвращает целое число, long или int,
         * ближайшее к вещественному числу, double или float, аргумента.
         * Иными словами — округляет дробь до целого числа.
         * округляет так, как привычно обывателю.
         * Если дробная часть числа больше либо равна 0.5,
         * то число будет округлено в большую сторону, иначе в меньшую.
         * Синтаксис:
         * long round(double d)
         * int round(float f)
         */

        System.out.println("Math.round()");

        System.out.println("Round value of val " + Math.round(1.3)); // 1
        System.out.println("Round value of val " + Math.round(1.4)); // 1
        System.out.println("Round value of val " + Math.round(1.5)); // 2
        System.out.println("Round value of val " + Math.round(1.6)); // 2

        System.out.println();

        /**
         * Метод Math.min() — возвращает минимальное значение из двух
         * аргументов.
         * Аргумент может быть int, float, long, double.
         * Принимает любой примитивный тип данных в качестве параметра.
         * Math.min() возвращает меньшее из двух аргументов.
         */

        System.out.println("Метод Math.min()");

        System.out.println("Min of two numbers : " + Math.min(0, -1.1)); //-1.1

        System.out.println();

        /**
         * Метод Math.max() — возвращает максимальное значение из двух
         * аргументов.
         * Аргумент может быть int, float, long, double.
         * Принимает любой примитивный тип данных в качестве параметра.
         * Math.max() возвращает максимальное число из двух аргументов.
         */

        System.out.println("Метод Math.max()");

        System.out.println("Max of two numbers : " + Math.max(0, -1.1)); // 0.0

        System.out.println();

        /**
         * Метод Math.pow() — возводит значение первого аргумента в степень
         * второго аргумента,
         * тем самым позволяет осуществить быстрое возведение в степень любых
         * значений.
         * Синтаксис: double pow(double base, double exponent), где
         * base — любой примитивный тип данных
         * exponent — любой примитивный тип данных
         * Math.pow() возвращает double значение первого аргумента, возведенное
         * в степень второго аргумента.
         */

        // Возведение в квадрат числа 5

        System.out.println("Метод Math.pow()");

        int a2 = 5;
        int b2 = 2;
        System.out.println("Число 5 в квадрате равно " + Math.pow(a2, b2));
        // 25.0

        // Возведение в куб числа 3
        int a4 = 3;
        int b4 = 3;
        System.out.println("Число 3 в кубе равно " + Math.pow(a4, b4)); // 27.0

        System.out.println();

        /**
         * Метод Math.random() — в Java используется для генерации случайного
         * числа в диапазоне от 0.0 до 1.0.
         * Различные диапазоны могут быть достигнуты с помощью арифметики.
         * Метод по умолчанию не принимает параметр.
         * Math.random() возвращает случайное double значение с положительным
         * знаком в диапазоне
         * больше или равно 0.0 и меньше 1.0 (0.0 <= Math.random() < 1.0).
         * Результат будет меняться каждый раз, когда Вы вызовете метод
         * Math.random().
         */

        System.out.println("Метод Math.random()");

        System.out.println("Случайное число: " + Math.random());

        //случайное число в диапазоне от 0 до 10

        int a = 0; // Начальное значение диапазона - "от"
        int b = 10; // Конечное значение диапазона - "до"

        int random_number1 = a + (int) (Math.random() * b); // Генерация числа
        System.out.println("Случайное число: " + random_number1);

        System.out.println();

        //рандомное число с плавающей точкой от 0 до 9
        //10 - 1 = 9
        System.out.println(Math.random() * 10);

        //рандомное целое число от 0 до 9
        //10 - 1 = 9
        System.out.println((int) (Math.random() * 10));

        //рандомное целое число от 20 до 29
        // 20 - число ОТ
        //(10 + 20) - 1 = 29 - число ДО
        System.out.println(((int) (Math.random() * 10)) + 20);

        /**
         * Метод Math.sqrt() — возвращает квадратный корень из аргумента.
         * Синтаксис: double sqrt(double d)
         * Math.sqrt() возвращает квадратный корень из аргумента.
         * Возвращает тип double.
         */

        System.out.println("Метод Math.sqrt()");

        int c = 4;
        Integer d = 9;
        System.out.println("Квадратный корень из " + c + " равен "
                + Math.sqrt(c)); // 2.0
        System.out.println("Квадратный корень из " + d + " равен "
                + Math.sqrt(d)); // 3.0

        System.out.println();

        /**
         * Методы byteValue(), shortValue(), intValue(), longValue(),
         * floatValue(), doubleValue()
         *
         * Метод xxxValue() — преобразует в Java числовое значение объекта,
         * который вызывает метод,
         * в примитивный тип данных, который возвращается из метода.
         *
         * Синтаксис: здесь каждый примитивный тип данных представляет
         * отдельный метод:         *
         * byte byteValue() // Преобразование в byte
         * short shortValue() // Преобразование в short
         * int intValue() // Преобразование в int
         * long longValue() // Преобразование в long
         * float floatValue() // Преобразование в float
         * double doubleValue() // Преобразование в double
         *
         * Параметры: являются по умолчанию методами и не несут никакой
         * параметр.
         * Метод xxxValue() в Java возвращает примитивный тип данных, который
         * задается в сигнатуре.
         */

        System.out.println("Метод xxxValue()");


        Integer x = 5;
        // Преобразовывает int в byte и возвращает примитивный тип данных byte
        System.out.println(x.byteValue()); // 5

        // Преобразовывает int в double и возвращает примитивный тип данных
        // double
        System.out.println(x.doubleValue()); // 5.0

        // Преобразовывает int в long и возвращает примитивный тип данных long
        System.out.println(x.longValue()); //5

        System.out.println();

        /**
         * Метод compareTo() — сравнивает числовой объект, который вызывает
         * метод, с аргументом.
         * При работе с числами метод compareTo() в Java позволяет сравнить два
         * числа одного типа,
         * например, byte, long, integer и т.д. Однако нельзя сравнивать два
         * разных типа аргумента
         * и числового объекта, вызывая метод они должны быть одного типа.
         *
         * Синтаксис
         * public int compareTo( NumberSubClass referenceName )
         * referenceName — должно быть byte, double, integer, float, long или
         * short.
         *
         * Возвращаемое значение:
         * Если Integer равно аргументу, то возвращается 0.
         * Если Integer меньше, чем аргумент, то возвращается -1.
         * Если Integer больше, чем аргумент, то возвращается 1.
         */

        System.out.println("Метод compareTo()");

        Integer y = 5;
        System.out.println(x.compareTo(3)); // 1
        System.out.println(x.compareTo(5)); // 0
        System.out.println(x.compareTo(8)); // -1

        System.out.println("");

        /**
         * Метод compareTo() в Java структурирован двумя вариантами.
         * Первый: метод сравнивает строку с другим объектом, а второй:
         * метод лексически сравнивает две строки.
         * Как работает compareTo() с числовым объектом мы рассмотрели выше.
         * Рассмотрим второй вариант: сравнение двух строк.
         *
         * Синтаксис метода:
         * int compareTo(Object o)
         * или
         * int compareTo(String anotherString)
         *
         * Параметры
         * o — объект для сравнения.
         * anotherString — строка для сравнения.
         *
         * Возвращаемое значение:
         * compareTo() получает значение 0, если аргумент является строкой
         * лексически равной данной строке;
         * значение меньше 0, если аргумент является строкой лексически большей,
         * чем сравниваемая строка;
         * и значение больше 0, если аргумент является строкой лексически
         * меньшей этой строки.
         */

        String str1 = "Я буду хорошим программистом!";
        String str2 = "Я буду хорошим программистом!";
        String str3 = "Я буду хорошим дворником!";

        int result = str1.compareTo(str2);
        System.out.println(result); // 0

        result = str2.compareTo(str3);
        System.out.println(result); // 11

        result = str3.compareTo(str1);
        System.out.println(result); // -11

        System.out.println();

        /**
         * length()
         * В Java length() возвращает длину последовательности символов,
         * представленного этим объектом.
         */

        System.out.println("Метод length()");

        String str7 = new String("Добро пожаловать на ProgLang.su");
        String str8 = new String("ProgLang.su" );

        System.out.print("Длина строки \"Добро пожаловать на ProgLang.su\"-" );
        System.out.println(str7.length());

        System.out.print("Длина строки \"ProgLang.su\"-" );
        System.out.println(str8.length());

        System.out.println();

        /**
         * Метод trim() — возвращает копию строки с пропущенными начальными и
         * конечными пробелами, другими словами метод позволяет в Java удалить
         * пробелы в начале и конце строки.
         */

        System.out.println("Метод trim()");

        String str4 = new String("   Добро пожаловать на ProgLang.su   ");

        System.out.print("Возвращаемое значение: ");
        System.out.println(str4.trim());

        System.out.println();

        /**
         * Метод replace() — возвращает В Java новую строку, в результате,
         * заменив все вхождения oldChar, в данной строке, на newChar, другими
         * словами — метод позволяет заменить символ в строке.
         * oldChar — старый символ;
         * newChar — новый символ.
         * replace(char oldChar, char newChar)
         */

        System.out.println("Метод replace()");

        String str5 = new String("Добро пожаловать на ProgLang.su");

        System.out.print("Возвращаемое значение: " );
        System.out.println(str5.replace('s', 'b'));

        System.out.println();

        /**
         * Метод replaceAll() — заменяет каждую подстроку данной строки,
         * которая соответствует заданному регулярному выражению, с данной
         * заменой, другими словами — метод позволяет заменить слово в строке.
         * String replaceAll(String regex, String replacement)
         * regex — регулярное выражение, которому данная строка должна
         * соответствовать;
         * replacement — строка, которая заменит найденное выражение.
         * replaceAll() возвращает результирующую строку
         */

        System.out.println("Метод replaceAll()");

        String str12 = new String("Добро пожаловать на ProgLang.su");

        System.out.print("Возвращаемое значение: ");
        System.out.println(str12.replaceAll("(.*)ProgLang(.*)",
                "IAMGROOT"));

        System.out.print("Возвращаемое значение: ");
        System.out.println(str12.replaceAll("ProgLang.su",
                "сайт посвященный программированию!"));

        System.out.println();


        /**
         * Метод isEmpty() используется для проверки, если length () равен 0
         * для данной строки.
         * Возвращаемое значение: true, если length () равно 0, иначе false         *
         */

        System.out.println("Метод isEmpty()");

        String str6 ="javaexercises";
        System.out.println();
        // prints length of string
        System.out.println("Length of string =" + str6.length());

        // checks if the string is empty or not
        System.out.println("Is this string empty? = " + str6.isEmpty());
        System.out.println();

        System.out.println();

        /**
         * Метод split() — в Java разделяет данную строку вокруг данного
         * регулярного выражения и имеет два варианта.
         *
         * public String[] split(String regex, int limit)
         * или
         * public String[] split(String regex)
         *
         * split() возвращает массив строк, вычисленных путем разделения
         * данной строки вокруг данного регулярного выражения
         *
         * Параметры
         * regex — разграничение регулярного выражения;
         * limit — порог, результатом которого означает, как много строк,
         * должно быть возвращено.
         */

        System.out.println("Метод split()");

        //Пример 1: разделить строку вокруг регулярного выражения

        String Str7 = new String("Добро-пожаловать-на-ProgLang.su");

        System.out.println("Возвращаемое значение: ");
        for (String retval : Str7.split("-", 2)) {
            System.out.println(retval);
        }

        //Пример 2: разделить строку на слова

        String Str8 = new String("Разделяем эту строку на слова");

        for (String retval : Str8.split(" ")) {
            System.out.println(retval);
        }

        System.out.println();

        /**
         * Метод indexOf() в Java имеет следующие варианты:
         * int indexOf(String str) — возвращает индекс в данной строке первого
         * вхождения указанной подстроки. Если эта подстрока не встречается,
         * возвращается -1.
         * int indexOf(String str, int fromIndex) — возвращает индекс в данной
         * строке первого вхождения указанной подстроки, начиная с указанного
         * индекса. Если не встречается, возвращается -1.
         * fromIndex — индекс, чтобы начать поиск (от);
         */

        System.out.println("Метод indexOf()");

        String str9 = new String("Добро пожаловать на ProgLang.su");
        String subStr1 = new String("Prog");
        String subStr2 = new String("Srog");

        System.out.print("Найденный индекс: ");
        System.out.println(str9.indexOf('о'));
        System.out.print("Найденный индекс: ");
        System.out.println(str9.indexOf('о', 5));
        System.out.print("Найденный индекс: ");
        System.out.println( str9.indexOf(subStr1));
        System.out.print("Найденный индекс: ");
        System.out.println( str9.indexOf(subStr1, 21));
        System.out.print("Найденный индекс: ");
        System.out.println(str9.indexOf(subStr2));

        System.out.println();

        /**
         * Метод lastIndexOf()
         * public int lastIndexOf(String str) — если аргумент строки
         * встречается один или несколько раз в подстроке в этом объекте,
         * то он возвращает индекс первого символа последней такой подстроки.
         * public int lastIndexOf(String str, int fromIndex) — возвращает
         * индекс внутри данной строки последнего вхождения указанной
         * подстроки, поиск осуществляется назад, начиная с указанного индекса.
         * fromIndex — индекс, чтобы начать поиск (от);
         */

        System.out.println("Метод lastIndexOf()");

        String str10 = new String("Добро пожаловать на ProgLang.su");
        String SubStr1 = new String("Prog");
        String SubStr2 = new String("Srog");

        System.out.print("Найденный последний индекс:");
        System.out.println(str10.lastIndexOf('о'));
        System.out.print("Найденный последний индекс: ");
        System.out.println(str10.lastIndexOf('о', 5));
        System.out.print("Найденный последний индекс: ");
        System.out.println(str10.lastIndexOf(SubStr1));
        System.out.print("Найденный последний индекс: ");
        System.out.println(str10.lastIndexOf(SubStr1, 21));
        System.out.print("Найденный последний индекс: " );
        System.out.println(str10.lastIndexOf(SubStr2));

        System.out.println();

        /**
         * Метод toLowerCase() возвращает строку, преобразованную в
         * нижний регистр.
         * Метод toUpperCase() возвращает строку, преобразованную в
         * верхний регистр.
         * Параметров нет.
         */

        System.out.println("Метод toLowerCase() and toUpperCase()");

        String str11 = new String("Добро пожаловать на ProgLang.su");

        System.out.print("Возвращаемое значение: ");
        System.out.println(str11.toLowerCase());

        System.out.print("Возвращаемое значение: ");
        System.out.println(str11.toUpperCase());

        System.out.println();

        /**
         * Метод charAt() — возвращает символ, расположенный по указанному
         * индексу строки. Индексы строк в Java начинаются с нуля.
         */

        System.out.println("Метод charAt()");

        String s = "Я буду хорошим программистом!";
        char result1 = s.charAt(8);
        char result2 = s.charAt(11);
        System.out.println("Восьмой символ строки - " + result1);
        System.out.println("Одиннадцатый символ строки - " + result2);

        System.out.println();

        /**
         * Метод concat() — возвращает строку со значением строки,
         * переданной в метод и приложенной к концу строки, используемой
         * для вызова этого метода. Проще говоря метод concat() в Java
         * объединяет строки, путем добавления одной строки в конец к другой.
         */

        System.out.println("Метод concat()");

        String str13 = "Я стану программистом!";
        str13 = str13.concat(" Очень хорошим программистом!");

        System.out.println(str13);

        System.out.println();

        /**
         * Метод substring() в Java имеет два варианта и возвращает новую
         * строку, которая является подстрокой данной строки. Подстрока
         * начинается с символа, заданного индексом, и продолжается до
         * конца данной строки или до endIndex-1, если введен второй аргумент.
         * public String substring(int beginIndex)
         * public String substring(int beginIndex, int endIndex)
         * beginIndex — начальный индекс, включительно;
         * endIndex — конечный индекс, не включая;
         * substring() возвращаемое значение заданно подстрокой
         */

        System.out.println("Метод substring()");

        String str14 = new String("Добро пожаловать на ProgLang.su");

        System.out.print("Возвращаемое значение: ");
        System.out.println(str14.substring(5));

        System.out.print("Возвращаемое значение: ");
        System.out.println(str14.substring(5, 15));

        System.out.println();

        /**
         * Метод contains() – это метод Java, позволяющий проверить, содержит
         * ли String другую подстроку или нет. Возвращает логическое значение,
         * поэтому его можно использовать непосредственно внутри операторов if.
         *
         */

        System.out.println("Метод contains()");

        String str_Sample = "This is a String contains Example";
        //Check if String contains a sequence
        System.out.println("Contains sequence 'ing': "
                + str_Sample.contains("ing"));
        System.out.println("Contains sequence 'Example': "
                + str_Sample.contains("Example"));
        //String contains method is case sensitive
        System.out.println("Contains sequence 'example': "
                + str_Sample.contains("example"));
        System.out.println("Contains sequence 'is String': "
                + str_Sample.contains("is String"));

        System.out.println();

        /**
         * Метод valueOf() в Java имеет следующие варианты, которые зависят
         * от передаваемых параметров. Этот метод возвращает строковое
         * представление переданного аргумента.
         * valueOf(boolean b) — возвращает строковое представление
         * логического аргумента.
         * valueOf(char c) — возвращает строковое представление char аргумента.
         * valueOf(char[] data) — возвращает строковое представление массив
         * char аргументов.
         * valueOf(char[] data, int offset, int count) — возвращает строковое
         * представление определенного подмассива массив char аргументов.
         * valueOf(double d) — возвращает строковое представление double
         * аргумента.
         * valueOf(float f) — возвращает строковое представление float
         * аргумента.
         * valueOf(int i) — возвращает строковое представление int аргумента.
         * valueOf(long l) — возвращает строковое представление long аргумента.
         * valueOf(Object obj) — возвращает строковое представление объекта
         * аргумента.
         */

        System.out.println("Метод valueOf");

        double d1 = 102939939.939;
        boolean b1 = true;
        long l = 1232874;
        char[] arr = { 'а', 'б', 'в', 'г', 'д', 'е', 'ё' };

        System.out.println("Возвращаемое значение: " + String.valueOf(d1));
        System.out.println("Возвращаемое значение: " + String.valueOf(b1));
        System.out.println("Возвращаемое значение: " + String.valueOf(l));
        System.out.println("Возвращаемое значение: " + String.valueOf(arr));

        System.out.println();
    }
}

