package com.nexttpo;

import java.util.ArrayList;
//extend the limit of the array list
public class Arraylist20 {
    public static void main(String[]args){
        ArrayList<String> list_Strings= new ArrayList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Mukul");
        list_Strings.add("Hitesh");
        list_Strings.add("Rahul");
        System.out.println(list_Strings);
        list_Strings.ensureCapacity(6);
        list_Strings.add("Aadisir");
        System.out.println(list_Strings);
    }
}
