package com.platzi.functional._11_composition;

import java.util.function.Function;

public class MathOperations2 {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyBy3 = x -> {
            System.out.println("Multiplying x: " + x + " by 3");
            return x * 3;
        };

        Function<Integer, Integer> add1MultiplyBy3 =
                /*Composing functions make that function that use the method executes first, then the one in parameter*/
            multiplyBy3.compose(y -> {
                System.out.println("Will add 1 to: " + y);
                return y +1;
            });

        //System.out.println(add1MultiplyBy3.apply(5));

        Function <Integer, Integer> andSquare =
                add1MultiplyBy3.andThen(x -> {
                    System.out.println("Rising: " + x + " to square");
                    return x * x;
                    /**/
                });

        System.out.println(andSquare.apply(3));
        /*add1MultiplyBy3 -> multiplyBy3 -> andSquare*/
    }
}
