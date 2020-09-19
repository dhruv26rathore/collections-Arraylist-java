package com.nexttpo;
import java.util.*;
public class Arraylist4 {
//Retrieve the element from the given place
    public static void main(String[]args){
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Mukul");
        list_Strings.add("Hitesh");
        list_Strings.add("Rahul");
        System.out.println(list_Strings);
        String element = list_Strings.get(0);
        System.out.println(element);
        element= list_Strings.get(4);
        System.out.println(element);
    }
}
