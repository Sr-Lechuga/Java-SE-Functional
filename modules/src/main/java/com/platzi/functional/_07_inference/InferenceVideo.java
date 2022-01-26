package com.platzi.functional._07_inference;

import com.platzi.functional._06_reference_operator.NameUtils;

import java.util.List;
import java.util.function.Function;

public class InferenceVideo {
    public static void main(String[] args) {
        Function<Integer,String> convertFunction =
                anInteger -> "To double: " + (anInteger*2);

        List<String> students = NameUtils.getList("Hugo", "Paco", "Lisa");
        students.forEach((String name) -> System.out.println(name));//Explicit
        students.forEach(name -> System.out.println(name));//Inference
        students.forEach(System.out::println);//Method reference
        /*Note that method reference should take same type parameter/s and return same type(this case void)*/

    }
}
