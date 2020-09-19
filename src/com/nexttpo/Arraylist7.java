package com.nexttpo;

import java.util.ArrayList;
import java.util.List;
//Searching the element in the array list
public class Arraylist7 {
    public static void main(String[]args){
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Mukul");
        list_Strings.add("Hitesh");
        list_Strings.add("Rahul");
        if(list_Strings.contains("Dhruv")){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}