package com.platzi.functional._10_chaining;

public class ChainingVideo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello ")
                .append("student ")
                .append("of ")
                .append("Platzi");
        Chainer chainer = new Chainer();
        chainer.sayHi().sayBye();
        /*It chains the results of various functions, returning finally the composition of all functions
        * without the necessity of store in a variable*/
    }

    static class Chainer{
        public Chainer sayHi(){
            System.out.println("Hello");
            return this;
        }

        public Chainer sayBye(){
            System.out.println("Bye");
            return this;
        }
    }

}
