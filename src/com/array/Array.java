package com.array;

import java.util.*;

public class Array {

    static ArrayList<String> arrayList = new ArrayList();

    public static void main(String[] args) {
       String str = "kalyani";

       char[] tochar = str.toCharArray();

        List<Character> ch = new LinkedList<>();
       // Collections.reverse(ch);
        for(char c: tochar)
            ch.add(c);

        //int result = ch.get(0).compareTo('s');
        //System.out.println(result);
        Collections.sort(ch);
        Iterator it = ch.iterator();

        Collections.reverse(ch);

        while(it.hasNext()){

            System.out.print(it.next());
        }








    }

    }

