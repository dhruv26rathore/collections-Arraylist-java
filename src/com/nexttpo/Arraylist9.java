package com.nexttpo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//copy one array into the another with sorting
public class Arraylist9 {
    public static void main(String[]args){
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Mukul");
        list_Strings.add("Hitesh");
        list_Strings.add("Rahul");

        List<String> list_Strings2 = new ArrayList();
        list_Strings2.add("Sumit2");
        list_Strings2.add("Dhruv2");
        list_Strings2.add("Mukul2");
        list_Strings2.add("Hitesh2");
        list_Strings2.add("Rahul");
        Collections.sort(list_Strings);
        Collections.sort(list_Strings2);
        Collections.copy(list_Strings, list_Strings2);
        System.out.println(list_Strings);
        System.out.println(list_Strings2);
    }
}
