
package ru.maksimowa;

public class TrainingWithOperators {

    public static void main(String[] args){

    // Присвоение
    int a = 10;
    int b = 3;

    //Математические операторы
    System.out.println("a+b="+(a+b));
    System.out.println("a-b="+(a-b));
    System.out.println("a*b="+(a*b));
    System.out.println("a%b="+(a%b));
    System.out.println("a/b="+(a/b));
    System.out.println("a--= " +  (a--));
    System.out.println("++a= " +  (++a));
    System.out.println("++b= " +  (++b));

    //Операторы сравнения
    System.out.println("a==b="+(a==b));
    System.out.println("a>b="+(a>b));
    System.out.println("a<b="+(a<b));
    System.out.println("a<=b="+(a<=b));
    System.out.println("a!=b="+(a!=b));

    //Переполнение
     int c =126;
     int d = (byte)(c+3);
     System.out.println(d);

     int h = 130;
     double i = 10.99;
     System.out.println("h + i = " + (h+i));
     System.out.println("h - i = " + (h-i));

     //Логические операторы
      boolean f =true;
      boolean g =false;
      System.out.println("f && g="+(f && g));
      System.out.println("f || t = " + (f || g));
      System.out.println("!g = " + (!g));
    }
}








