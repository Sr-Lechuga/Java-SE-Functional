package com.platzi.functional._05_sam;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class AgeUtils {
    public static void main(String[] args) {
        /*Takes a number and if number is less than 10, it puts a 0 before number and returns it as a String
        * If not, it just returns the number in String*/
        Function<Integer,String> addZeros = x -> x < 10 ? "0" + x : String.valueOf(x);


        TriFunction<Integer, Integer, Integer, LocalDate> parseDate =
                (day, month, year) -> LocalDate.parse(year + "-" + addZeros.apply(month) + "-" + addZeros.apply(day));

        TriFunction<Integer, Integer, Integer, Integer> calculateAge =
                (day, month, year) -> Period.between(
                        parseDate.apply(day,month,year), LocalDate.now()
                ).getDays();
    }
    /*TriFunction Takes three different type parameters, and return a new one */
    @FunctionalInterface
    interface TriFunction<T, U, V, R>{
        R apply(T t, U u, V v);
    }
}
