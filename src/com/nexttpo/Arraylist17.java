package com.nexttpo;

import java.util.ArrayList;
import java.util.List;
//removing all from array list
public class Arraylist17 {
    public static void main(String[]args){
    List<String> list_Strings = new ArrayList();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Mukul");
        list_Strings.add("Hitesh");
        list_Strings.add("Rahul");
        System.out.println(list_Strings);
        list_Strings.removeAll(list_Strings);
        System.out.println(list_Strings);
    }
}
