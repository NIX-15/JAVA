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
    // Надо использовать stringbuilder, stringbuffer для изменения строки правильно
    System.out.println(msg);
    String str1 = "Hello";
    String str2 = new String("Hello"); // есть пул строк(оптимизация) а есть прямое создание через объект класса.
    System.out.println(str1==str2); // разные объекты в памяти, но если обе строки через пул, то адрес будет один (true)
    System.out.println(str1.equals(str2)); // содержимое одинаково
    var a = 99;
    System.out.println(a);
    var b = 'r';
    System.out.println(b);
    System.out.println(getType(a));
    System.out.println(getType(b));
  
    
    
}
static String getType(Object obj) {
    return obj.getClass().getSimpleName(); //порой надо прописывать классы для применения методов
    //в частности, для определения типа данных примитива придется вызывать именно метод, написанный во вне.
} 
}
