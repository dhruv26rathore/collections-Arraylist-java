package com.nexttpo;
//cloning of arraylist
import java.util.ArrayList;
public class Arraylist16 {
    public static void main(String[]args){
        ArrayList<String> list_Strings= new ArrayList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Mukul");
        list_Strings.add("Hitesh");
        list_Strings.add("Rahul");
        System.out.println(list_Strings);
        ArrayList<String> list_Strings2 = (ArrayList<String>)list_Strings.clone();
        System.out.println(list_Strings2);
    }
}
