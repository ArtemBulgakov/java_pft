package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("word");
        hello("user");
        hello("Artem");

        Square s = new Square(5);
        System.out.println("пл. квад со стор. " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4,6);
        System.out.println("пл. прямоуг. со стор. " + r.a + " и " + r.b + " = " + r.area());
    }
    public static void hello (String somebody) {
        System.out.println("Hello, " + somebody );
    }


}