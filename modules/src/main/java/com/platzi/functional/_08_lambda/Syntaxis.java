package com.platzi.functional._08_lambda;

import com.platzi.functional._06_reference_operator.NameUtils;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Syntaxis {
    public static void main(String[] args) {
        List<String> courses = NameUtils.getList("Java", "Javascript", ".Net");
        courses.forEach(curse -> System.out.println(curse));

        //BiFunction<Integer, Integer, Integer> s = (x,y) -> x * y;
        useXero(() -> 2);//No parameter
        /*There is a Function in useXero with no name. This is a Lambda*/
        usePredicate(text -> text.isEmpty());//One Parameter

        useBiFunction((x,y) -> x * y);//Two parameter

        useBiFunction((x,y) -> {
            System.out.println("X: " + x + ", Y: " +y);
            return x - y;
            /*Can make more than a return, like print in console,
            * so it is needed to explicit tell where is the return value*/
        });

        useNothing(() -> {
            System.out.println("Hello student");
            System.out.println("Hello student");
            System.out.println("Hello student");
        });//Receives nothing and retrieves nothing

        //useBiFunction((int x, int y) -> x * y); Can't use primitive types
        useBiFunction((Integer x, Integer y) -> x * y);

    }

    static void useNothing(OperateNothing operateNothing){

    }
    @FunctionalInterface
    interface OperateNothing{
        void nada();
    }

    static void useXero(ZeroArguments zeroArguments){
    }
    
    static void useBiFunction(BiFunction<Integer, Integer, Integer> operation){
        
    }
   static void usePredicate(Predicate<String> predicate){
        
    }
    
    @FunctionalInterface
    interface ZeroArguments{
        int get();
    }
}
