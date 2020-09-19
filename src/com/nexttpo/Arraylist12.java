package com.nexttpo;

import java.util.ArrayList;
import java.util.*;
//Get the some part of the array list
public class Arraylist12 {
    public static void main(String[]args) {
        List<String> list_Strings = new ArrayList();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Mukul");
        list_Strings.add("Hitesh");
        list_Strings.add("Rahul");
        System.out.println(list_Strings);
        List<String> sub_List = list_Strings.subList(0,3);
        System.out.println(sub_List);
    }
}
