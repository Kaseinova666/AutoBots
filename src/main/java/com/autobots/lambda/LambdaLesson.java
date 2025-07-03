package com.autobots.lambda;

import java.util.function.*;

public class LambdaLesson {
    public static void main(String[] args) {

        MathOperation addition = (a, b) -> a + b;
        MathOperation multi = (a, b) -> a * b;

        System.out.println("5 + 3 = " + addition.operation(5,3));
        System.out.println("5 * 3 = " + multi.operation(5,3));

        //                                                                    Object                   Boolean
        Predicate<String> isNotEmpty = s -> !s.isEmpty(); // принимает любой обьект и возвращает булиновское значение
        System.out.println(isNotEmpty.test(""));
        System.out.println(isNotEmpty.test("String"));

        // принимает число и возвращает строку
        Function<Integer, String> toStringFun = i -> "Число: " + i;
        System.out.println(toStringFun.apply(10));

        Consumer<String> print = s -> System.out.println("Writing: " + s);
        print.accept("Hi");

    }
}
