package com.platzi.functional._15_streams_intro;

import java.util.stream.IntStream;

public class TypeStream {
    public static void main(String[] args) {
        IntStream infiniteStream = IntStream.iterate(0,x -> x + 1);
        /*It generates numbers until infinite.
        * so, it is needed to define when to stop*/
        infiniteStream.limit(1000) //Stop at 1000
                .parallel() //divides the work into threads, use concurrency. But it returns values dis-ordered
                .filter(x -> x % 2 == 0) //just take even numbers
                /*.allMatch()-- it's a predicate that takes an int value and returns a boolean, used to validate a list
                                like a list of emails
                 */
                .forEach(System.out::println);
    }
}
