
package JAVA.lection1;

import java.util.*;

public class lection1 {
    public static void main(String[] args) {
        System.out.println("Hi!");
        short age = 10;
        int salary = 123456;
        double e = 2.7;
        float pi = 3.14f;
        System.out.println(age);
        System.out.println(salary);
        System.out.println(e);
        System.out.println(pi);
        char ch = '8';
        System.out.println(Character.isDigit(ch));
        ch = 'a';
        System.out.println(Character.isDigit(ch));
        boolean flag1 = 123 <= 234;
        System.out.println(flag1);
        boolean flag2 = 345 >= 456 || flag1;
        System.out.println(flag2);
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3);
        String msg = "This was the basics of data types";
        System.out.println(msg);
        msg = "Go"; // Ссылка на объект переопредилилась на другой участок памяти, но предыдущее
                    // значение осталось где-то без ссылки.
        // Надо использовать stringbuilder, stringbuffer для изменения строки правильно
        System.out.println(msg);
        String str1 = "Hello";
        String str2 = new String("Hello"); // есть пул строк(оптимизация) а есть прямое создание через объект класса.
        System.out.println(str1 == str2); // разные объекты в памяти, но если обе строки через пул, то адрес будет один
                                          // (true)
        System.out.println(str1.equals(str2)); // содержимое одинаково
        var a = 99;
        System.out.println(a);
        var b = 'r';
        // var b = "'s";
        System.out.println(b);
        System.out.println(getType(a));
        System.out.println(getType(b));
        // var c = a+b; // Плохо так неявно преобразовывать в строку. Их создастся аж 4.
        // Используй StringBuilder.
        // System.out.println(c);
        // System.out.println(getType(c)); будет 213 integer. Java преобразует char в
        // код asci при его сложении с int. Результатом конкатенации будет int.
        Integer wrappedA = Integer.valueOf(a); // Оборачиваем примитив int в объект класса обёртки integer. И у нас
                                               // открывается много функционала как с экземпляром.
        System.out.println("Wrapped Integer: " + wrappedA);
        System.out.println(Integer.MAX_VALUE);
        Boolean isEven = wrappedA % 2 == 0;

        if (isEven) {
            System.out.println(wrappedA + " is even!");
        } else {
            System.out.println(wrappedA + " is odd!");
        }
        System.out.println(++wrappedA); // Префиксный инкремент приоритетнее вывода в консоль
        System.out.println(wrappedA++);// Вывод в консоль приорететнее постфиксного инкремента. +1 Будет после вывода.
        System.out.println(wrappedA);
        wrappedA--;
        System.out.println(--wrappedA);
        Random rand = new Random();
        int dim = rand.nextInt(10);
        // int randij = rand.nextInt(2001)-1000;
        int[][] arrint = new int[dim][dim];
        for (int i = 0; i < arrint.length; i++) {
            for (int j = 0; j < arrint.length; j++) {
                arrint[i][j] = rand.nextInt(2001) - 1000;
                System.out.print(arrint[i][j] + " "); // Посмотрели форматированный вывод и массивы
            }
            System.out.println();
        }

        double[][] arrdouble = new double[arrint.length][arrint[0].length];

        /*
         * // Проходим по массиву и конвертируем значения.
         * for (int i = 0; i < arrdouble.length; i++) {
         * for (int j = 0; j < arrdouble[i].length; j++) {
         * arrdouble[i][j] = (double) arrint[i][j]; // Приведение типа
         * System.out.print(arrdouble[i][j] + " "); // Печатаем значение
         * }
         * System.out.println(); // Печатаем перевод строки
         * }
         * }
         */// доделать
        Scanner iScanner = new Scanner(System.in);

        System.out.printf("Введите степень многочлена А: ");
        int k1 = iScanner.nextInt();
        System.out.printf("Введите степень многочлена B: ");
        int k2 = iScanner.nextInt();
        System.out.printf("%d,%d \n", k1, k2);
        iScanner.close();

        int[] arrA = new int[k1 + 1];
        int[] arrB = new int[k2 + 1];

        fillArr(arrA);
        fillArr(arrB);
        System.out.println("Done!");
    }

    static String getType(Object obj) {
        return obj.getClass().getSimpleName(); // порой надо прописывать классы для применения методов
        // в частности, для определения типа данных примитива придется вызывать именно
        // метод, написанный во вне.
    }

    public static void fillArr(int[] arr) {
        Random rand = new Random();

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = rand.nextInt(201) - 100;

            if (i == arr.length - 1) {
                if (arr[arr.length - 1] == 0) {
                    arr[arr.length - 1] = 1;// что бы не нарушалась степень многочлена k
                }
                if (Math.abs(arr[arr.length - 1]) == 1) {

                    System.out.print(arr[arr.length - 1] == 1 ? "x^" + (arr.length - 1) : "-x^" + (arr.length - 1)); // что
                                                                                                                      // бы
                                                                                                                      // не
                                                                                                                      // показывал
                                                                                                                      // 1x...
                } else {
                    System.out.print(arr[arr.length - 1] + "x^" + (arr.length - 1));
                }
            }
            else if (i < arr.length - 1 && i > 0) {
                if (arr[i] != 0) {
                    if (Math.abs(arr[i]) == 1) {
                        System.out.print(arr[i] == 1 ? "+x^" + i : "-x^" + i);
                    } else {
                        System.out.print(arr[i] > 0 ? "+" + arr[i] + "x^" + i : arr[i] + "x^" + i);
                    }

                }
            }
            else {
                if (arr[0] != 0) {
                    System.out.println(arr[0] > 0 ? "+" + arr[0] : arr[0]);
                }

            }

        }

    }

}
