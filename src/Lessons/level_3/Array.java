package Lessons.level_3;

import java.util.Arrays;

public class Array {

    static void ChangeArray(Object[] arrayForChang, int first, int second ) {
        arrayForChang = new String[]{"str1", "str2", "str3", "str4", "str5"};

        System.out.println(Arrays.toString(arrayForChang));
        if (first <= arrayForChang.length && second <= arrayForChang.length) {
            Object oneElement = arrayForChang[first];
            arrayForChang[first] = arrayForChang[second];
            arrayForChang[second] = oneElement;
            System.out.println();
            System.out.println(Arrays.toString(arrayForChang));
        }
        
    }
    public static void main(String[] args) {
        ChangeArray(new String[]{"str1", "str2", "str3", "str4", "str5"}, 0, 3);
    }

    @Override
    public String toString() {
        return "Array{}";
    }
}
