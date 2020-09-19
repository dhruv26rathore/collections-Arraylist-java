package com.nexttpo;

import java.util.ArrayList;
//print the elements of the arraylist by its index value
public class Arraylist22 {
    public static void main(String[]args) {
    ArrayList<String> list_Strings= new ArrayList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Mukul");
        list_Strings.add("Hitesh");
        list_Strings.add("Rahul");
        System.out.println(list_Strings);
        int no_of_elements = list_Strings.size();
        for (int i = 0; i < no_of_elements; i++)
            System.out.println(list_Strings.get(i));
    }
}
