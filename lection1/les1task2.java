package JAVA.lection1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import JAVA.lection1.les1task1;

public class les1task2 {
    public static void main(String[] args) {

    }

    static int[] getArr(int q) {
        int[] arr = new int[0];
        String fileName = "file" + q + ".txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        StringBuilder coefficient = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            // for (int i = 0; i < line.length(); i++) {
            /*
             * char c = line.charAt(i);
             * 
             * // Если символ - цифра или знак +/-, добавляем его к текущему коэффициенту
             * if (Character.isDigit(c) || c == '-') {
             * coefficient.append(c);
             * }
             * 
             * // Когда встречаем 'x', добавляем текущий коэффициент в список и очищаем
             * текущее значение
             * if (c == 'x') {
             * line.add(coefficient.toString());
             * coefficient.setLength(0);
             * }
             */
            return arr;
        }
    
}
