package com.nexttpo;
import java.util.ArrayList;
//trim the capcity of array list
public class Arraylist19 {
    public static void main(String[]args){
        ArrayList<String> list_Strings= new ArrayList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Mukul");
        list_Strings.add("Hitesh");
        list_Strings.add("Rahul");
        System.out.println(list_Strings);
        list_Strings.trimToSize();
        System.out.println(list_Strings);
    }
}
