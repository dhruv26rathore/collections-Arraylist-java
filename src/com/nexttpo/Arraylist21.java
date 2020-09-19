package com.nexttpo;
import java.util.ArrayList;
//replace with a particular element in the given array with the given element
public class Arraylist21 {
    public static void main(String[]args){
    ArrayList<String> list_Strings= new ArrayList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Mukul");
        list_Strings.add("Hitesh");
        list_Strings.add("Rahul");
        System.out.println(list_Strings);
        String new_Element = "pritesh";
        list_Strings.set(1,new_Element);
        int num = list_Strings.size();
        System.out.println("After replace");
        for(int i=0;i<num;i++)
            System.out.println(list_Strings.get(i));

}}
