package com.nexttpo;

import java.util.ArrayList;
import java.util.List;
//Concat two arrays
public class Arraylist15 {
    public static void main(String[]args){
        List<String> list_Strings = new ArrayList();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Mukul");
        list_Strings.add("Hitesh");
        list_Strings.add("Rahul");

        List<String> list_Strings2 = new ArrayList();
        list_Strings2.add("Sbt");
        list_Strings2.add("Druv");
        list_Strings2.add("Mul");
        list_Strings2.add("Hish");
        list_Strings2.add("Ral");

        ArrayList<String> list_Strings3 = new ArrayList<String>();
        list_Strings3.addAll(list_Strings);
        list_Strings3.addAll(list_Strings2);
        System.out.println(list_Strings3);
    }
}