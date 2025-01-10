package JAVA.lection1;

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
    boolean flag2 = 345>=456 || flag1;
    System.out.println(flag2);
    boolean flag3 = flag1 ^ flag2;
    System.out.println(flag3);
    String msg = "This was the basics of data types";
    System.out.println(msg);
    msg = "Go"; // Ссылка на объект переопредилилась на другой участок памяти, но предыдущее значение осталось где-то без ссылки.
    System.out.println(msg);
    String str1 = "Hello";
    String str2 = new String("Hello");
    System.out.println(str1==str2);
    System.out.println(str1.equals(str2));
}
}
