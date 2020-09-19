package com.nexttpo;
import java.util.ArrayList;
import java.util.*;
//Iterate through all elements in a array list
public class Arraylist2 {
    public static void main(String[]args){
    List<String> list_Strings = new ArrayList<String>();
            list_Strings.add("Sumit");
            list_Strings.add("Dhruv");
            list_Strings.add("Mukul");
            list_Strings.add("Hitesh");
            list_Strings.add("Rahul");
        for (String elements:list_Strings) {
            System.out.println(elements);
        }
}
}
