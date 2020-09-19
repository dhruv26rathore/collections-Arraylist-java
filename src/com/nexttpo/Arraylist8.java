package com.nexttpo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Sorting the collections
public class Arraylist8 {
    public static void main(String[]args){
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Mukul");
        list_Strings.add("Hitesh");
        list_Strings.add("Rahul");
        System.out.println(list_Strings);
        Collections.sort(list_Strings);
        System.out.println(list_Strings);
    }
}
