package com.nexttpo;

import java.util.ArrayList;
//check aaray list empty or not
public class Arraylist18 {
    public static void main(String[]args){
        ArrayList<String> list_Strings= new ArrayList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Mukul");
        list_Strings.add("Hitesh");
        list_Strings.add("Rahul");
        System.out.println(list_Strings);
        System.out.println(list_Strings.isEmpty());
        list_Strings.removeAll(list_Strings);
        System.out.println(list_Strings);
        System.out.println(list_Strings.isEmpty());
    }
}
