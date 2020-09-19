package com.nexttpo;
import java.util.ArrayList;
import java.util.*;
//Update specific array element by given element
public class Arraylist5 {
    public static void main(String[]args){
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Mukul");
        list_Strings.add("Hitesh");
        list_Strings.add("Rahul");
        System.out.println(list_Strings);
        list_Strings.set(2,"AdityaSir");
        System.out.println(list_Strings);
    }
}
