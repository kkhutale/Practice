package com.generic;

public class Main {
    public static void main(String[] args) {

        /*Data data = new Data("Some string");
        String var =(String) data.getObj();
        System.out.println(var);*/

        Generic<String> generic= new Generic<String>("Some data");

        System.out.println(generic.getData());


        Generic<Integer> generic1 = new Generic<Integer>(34);
        System.out.println(generic1.getData());



    }
}
