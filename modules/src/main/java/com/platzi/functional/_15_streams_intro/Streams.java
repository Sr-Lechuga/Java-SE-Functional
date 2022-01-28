package com.platzi.functional._15_streams_intro;

import com.platzi.functional._06_reference_operator.NameUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> courseList = NameUtils.getList(
                "Java",
                "FrontEnd",
                "BackEnd",
                "FullStack"
        );

        for(String course : courseList){
            String newCourse = course.toLowerCase().replace("!","!!");
            System.out.println("Platzi: " + newCourse);
        }

        Stream<String> coursesStream = Stream.of("Java", "FrontEnd", "BackEnd", "FullStack");

        //Stream<Integer> courseLengthStream = coursesStream.map(course -> course.length());

        //Optional<Integer> longest = courseLengthStream.max((x, y) -> y-x);
        /*.max return the greatest element in stream, according to rules settled in function comparator */

        Stream<String> emphasisCourses = coursesStream.map(course -> course + "!");
        /*.map, generates from a stream a new one, according to the rules settled in the function mapper*/

        Stream<String> justJavaCourses = coursesStream.filter(course -> course.contains("Java"));

        emphasisCourses.forEach(System.out::println);
    }

    //Note that steams get "consumed" if they are operated with any method (they have durability 1 xD)
    //That's the error in line 33
}
