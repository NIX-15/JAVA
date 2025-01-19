package JAVA.lection1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import JAVA.lection1.les1task1;

public class les1task2 {
    public static void main(String[] args) {
        getArr(1);
        getArr(2);
    }

    static int[] getArr(int q) {
        ArrayList<Integer> list = new ArrayList<>();
        String fileName = "file" + q + ".txt";
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            sb.append(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace(); // Обработка исключений
        }
        StringBuilder tempSB = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            char currentChar = sb.charAt(i); // текущий символ

            if (i == 0) {
                while (currentChar != 'x') {
                    tempSB.append(currentChar);
                    i++;
                }
                try {
                    if (tempSB.length() == 1 && tempSB.charAt(0) == '-') {
                        list.add(-1);
                    } else if (tempSB.length() == 0) {
                        list.add(1);
                    } else {
                        list.add(Integer.parseInt(tempSB.toString()));
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка преобразования: " + e.getMessage());
                }
                tempSB.setLength(0);
            } else if (sb.charAt(i) == 'x') {
                while (currentChar != '+' || currentChar != '-') {
                    tempSB.append(currentChar - 1);
                    if (currentChar - 2 == '-') {
                        tempSB.append(currentChar - 2);
                    }
                    tempSB.reverse();
                    try {
                        if (tempSB.length() == 1 && tempSB.charAt(0) == '-') {
                            list.add(-1);
                        } else if (tempSB.length() == 0) {
                            list.add(1);
                        } else {
                            list.add(Integer.parseInt(tempSB.toString()));
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка преобразования: " + e.getMessage());
                    }
                }
                tempSB.setLength(0);
            }
            else if(i==sb.length()-1){

            }
        }
        return list;

    }

}
