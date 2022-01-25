package com.platzi.functional._04_functional;

import java.util.function.*;

public class StringFunctions {
    public static void main(String[] args) {
        /*It recives an Object, and returns an Object of the same type, with the desaired transformation*/
        UnaryOperator<String> quote = text -> "\"" + text + "\"";
        UnaryOperator<String> addMark = text -> text +"!";

        System.out.println(quote.apply("Scarred Potter?"));
        System.out.println(quote.apply(addMark.apply("You wish")));
        /*It can be compounded if object are similar*/

        /*Takes two parameters and return a new one*/
        BiFunction<Integer, Integer, Integer> product =
                (x,y) -> x * y;
        /*If all parameters are of the same type, it can be done with a BinaryOperator*/
        BinaryOperator<Integer> product2 = (x,y) -> x * y;
        System.out.println(product.apply(5,3));

        BiFunction<String, Integer, String > leftPad =
                (text, number) -> String.format("%" + number + "s", text);
        System.out.println(leftPad.apply("Java",10));

    }
}
