package com.nexttpo;
import java.util.*;
//Insert an element into the list at the first position
public class Arraylist3 {
    public static void main(String[]args){
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Mukul");
        list_Strings.add("Hitesh");
        list_Strings.add("Rahul");
        System.out.println(list_Strings);
        // Now insert a color at the first and last position of the list
        list_Strings.add(1, "Pritesh");
        list_Strings.add(0, "Abhishek");
        // Print the list
        System.out.println(list_Strings);
    }
}
