package com.practice;

import javax.security.auth.login.FailedLoginException;
import java.util.Scanner;
enum  Enum {

    MONDAY,TUESDAY,WEDNESDAY;

    Enum(){
        System.out.println("Days: "+this.toString());
    }


}

 public class Main {

     static public void main(String[] args) {

         System.out.println(Enum.MONDAY);


     }
 }
/*
    public static void scanner() throws Exception{
        Scanner scan = new Scanner(System.in);
        int name = scan.nextInt();
        scan.close();
        switch (name){
            case 1: throw new RuntimeException();
            case 2:throw new FailedLoginException();
            default: throw new UsExp();

        }



    }


}*/
