package Lessons.level_3;

import java.util.ArrayList;

public class Fruit {
    private float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    float getWeight() {
        return weight;
    }
    public static float weightBox(ArrayList<Float> listFruits, float weightBox){
        for (int i = 0; i < listFruits.size(); i++) {
            weightBox += listFruits.get(i);

        }
        return weightBox;
    }


    }

