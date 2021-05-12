package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("word");
        hello("user");
        hello("Artem");

        double l = 5;
        System.out.println("пл. квад со стор. " + l + " = " + area(l));
        double a = 4;
        double b = 6;
        System.out.println("пл. прямоуг. со стор. " + a + " и " + b + " = " + area(a,b));
    }
    public static void hello (String somebody) {
        System.out.println("Hello, " + somebody );
    }

    public static double area (double len) {
        return len * len;
    }

    public static double area(double a, double b) {
        return a * b;
    }

}