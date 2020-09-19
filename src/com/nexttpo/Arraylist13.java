package com.nexttpo;

import java.util.ArrayList;
import java.util.List;
//Compare arraylists
public class Arraylist13 {
    public static void main(String[]args) {
        List<String> list_Strings = new ArrayList();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Mukul");
        list_Strings.add("Hitesh");
        list_Strings.add("Rahul");
        System.out.println(list_Strings);
        List<String> list_Strings2 = new ArrayList();
        list_Strings2.add("Sumit");
        list_Strings2.add("Dhruv");
        list_Strings2.add("Mukl");
        list_Strings2.add("Hitesh");
        list_Strings2.add("Rahu");
        ArrayList<String> list_Strings3 = new ArrayList<String>();
        for (String e : list_Strings)
            list_Strings3.add(list_Strings2.contains(e) ? "Yes" : "No");
        System.out.println(list_Strings3);
    }
}
