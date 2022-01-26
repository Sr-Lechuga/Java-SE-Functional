package com.platzi.functional._06_reference_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class NameUtils {
    public static void main(String[] args) {
        List<String> professors = getList("Nicolas", "Juan", "Zulema");
        Consumer<String> printer = text -> System.out.println(text);
        System.out.println("/////////");
        professors.forEach(System.out::println);

        /*The method reference, is equal to the lambda expression
        * text -> System.out.println(text) == professors.forEach(System.out::println)
        *
        * since they actually do the same thing, but method reference looks cleaner
        * */
    }

    static <T> List<T> getList(T... elements){
        return Arrays.asList(elements);
    }
}
