package Lessons.level_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Orange extends Fruit {
    public Orange() {
        super(1.5f);
    }


    public static void main(String[] args) {
        Float[] oranges = new Float[]{1.5f, 3.0f, 1.5f, 2.5f, 1.5f};
        ArrayList<Float> orangeList = new ArrayList<Float>();
        Collections.addAll(orangeList, oranges);
        System.out.println(Arrays.toString(new ArrayList[]{orangeList}));

    }
}
