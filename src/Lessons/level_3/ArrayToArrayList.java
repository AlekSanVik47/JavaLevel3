package Lessons.level_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {
    
    static void convertToArrayList(String[] arr, List<String> listOfStrings, String str) {
        
        listOfStrings = new ArrayList<String>();
        Collections.addAll(listOfStrings, arr);
        listOfStrings.add(str);
        System.out.println(listOfStrings);


    }

    public static void main(String[] args) {
        String[] arr = new String[]{"str1", "str2", "str3", "str4", "str5"};
        List<String> listOfStrings = new ArrayList<String>();
        String str = "str6";

        convertToArrayList(arr, listOfStrings, str);

    }

}
