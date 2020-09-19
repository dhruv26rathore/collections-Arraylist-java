package com.nexttpo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Swaping in the array list
public class Arraylist14 {
public static void main(String[]args){
    List<String> list_Strings = new ArrayList();
    list_Strings.add("Sumit");
    list_Strings.add("Dhruv");
    list_Strings.add("Mukul");
    list_Strings.add("Hitesh");
    list_Strings.add("Rahul");

    for (String a:list_Strings) {
        System.out.println(a);
    }
    System.out.println("-------------------------------------------------");
    Collections.swap(list_Strings,0,2);
    for (String b:list_Strings
         ) {
        System.out.println(b);
    }
}
}
