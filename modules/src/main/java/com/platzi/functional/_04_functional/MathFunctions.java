package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x*x;
            }
        };
        System.out.println(square.apply(5));

        /*Functions can also be created this way*/
        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;

        /*To return a boolean*/
        Predicate<Integer> isEven = x -> x % 2 == 0;

        isEven.test(2);

        Predicate<Student> isApproved = student -> student.getQualification() >= 6.0;

        Student lechuga = new Student(5.9);
        isApproved.test(lechuga);
    }

    static class Student{
        private double qualification;

        public Student(double qualification) {
            this.qualification = qualification;
        }

        public double getQualification() {
            return qualification;
        }

    }
}
