package JAVA.lection1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class les1task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        polynomeFile(filledArr(iScanner), 1);
        polynomeFile(filledArr(iScanner), 2);
        iScanner.close();
    }

    static int[] filledArr(Scanner iScan) {
        Random rand = new Random();
        System.out.printf("Введите степень многочлена : ");
        int k = iScan.nextInt();

        while (k < 2) {
            System.out.println("Ошибка ввода! Степень многчлена должна быть не меньше 2 (k<=2)!");
            System.out.printf("Введите степень многочлена : ");
            k = iScan.nextInt();
        }
        // iScanner.close();
        int[] arr = new int[k + 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = rand.nextInt(201) - 100;
        }
        if (arr[arr.length - 1] == 0) {
            arr[arr.length - 1] = 1;
        } // что бы не нарушалась степень многочлена k
        return arr;
    }

    static void polynomeFile(int arr[], int q) {
        String fileName = "file" + q + ".txt";
        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - 1) {
                if (Math.abs(arr[arr.length - 1]) == 1) {
                    sb.append(arr[arr.length - 1] == 1 ? "x^" + (arr.length - 1)
                            : "-x^" +
                                    (arr.length - 1)); // что бы не показывал 1x
                } else {
                    sb.append(arr[arr.length - 1] + "x^" + (arr.length - 1));
                }
            } else if (i < arr.length - 1 && i > 1) {
                if (arr[i] != 0) {
                    if (Math.abs(arr[i]) == 1) {
                        sb.append(arr[i] == 1 ? "+x^" + i : "-x^" + i);
                    } else {
                        sb.append(arr[i] > 0 ? "+" + arr[i] + "x^" + i : arr[i] + "x^" + i);
                    }

                }
            } else if (i == 1) {
                // arr[i]=0;
                if (arr[i] != 0) {
                    if (Math.abs(arr[i]) == 1) {
                        sb.append(arr[i] == 1 ? "+x" : "-x");
                    } else {
                        sb.append(arr[i] > 0 ? "+" + arr[i] + "x" : arr[i] + "x");
                    }

                }
            } else {
                // arr[0]=0;
                if (arr[0] != 0) {
                    sb.append(arr[0] > 0 ? "+" + arr[0] : arr[0]);
                }

            }

        }
        String polynome = sb.toString();
        // System.out.println(polynome);
        try (

                FileWriter fw = new FileWriter(fileName, false)) {
            fw.write(polynome);
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}