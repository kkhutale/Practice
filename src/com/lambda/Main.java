package com.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Data> list = new ArrayList<>();
        list.add(new Data("Kalyani"));
        list.add(new Data("Vishal"));
        list.add(new Data("Vaishnavi"));
        list.add(new Data("Mauli"));




        list.forEach(i-> {

            System.out.println(i.getData());});




       /* Collections.sort(list,(Data o1,Data o2)->{

            if(o1.getData().length()<o2.getData().length()){
                return -1;
            }
            else if (o1.getData().length()>o2.getData().length()){
                return 1;
            }
            else
                return 0;

        });


        for (Data data:list) {

            System.out.println(data);

        }*/


    /* Lambda lambda = (int x )-> {
         System.out.println("value of x:  "+x);
         System.out.println("Value of y");
         return 78;
     };
        System.out.println(lambda.demo(9));*/

   // final int x =10;
    //x++;
    //new Thread(()-> System.out.println("value of x"+x)).start();







    }
}
