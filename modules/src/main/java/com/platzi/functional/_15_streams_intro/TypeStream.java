package com.platzi.functional._15_streams_intro;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TypeStream {
    public static void main(String[] args) {
        IntStream infiniteStream = IntStream.iterate(0,x -> x + 1);
        /*It generates numbers until infinite.
        * so, it is needed to define when to stop*/
        List<Integer> numbersList = infiniteStream.limit(1000) //Stop at 1000
                .filter(x -> x % 2 == 0) //just take even numbers
                .boxed() //Transforms into a specific type of Stream
                .collect(Collectors.toList());
    }
}
