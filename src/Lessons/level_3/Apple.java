package Lessons.level_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Apple extends Fruit {

    public Apple() {
        super(1.0f);
    }


    public static void main(String[] args) {
        Float[] apples = new Float[]{1.0f, 2.0f, 3.0f, 2.0f, 4.0f};
        ArrayList<Float> applList = new ArrayList<Float>();
        Collections.addAll(applList, apples);
        System.out.println(Arrays.toString(new ArrayList[]{applList}));
    }


}
