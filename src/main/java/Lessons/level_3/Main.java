package Lessons.level_3;

import java.util.*;

import static Lessons.level_3.Array.ChangeArray;
import static Lessons.level_3.ArrayToArrayList.convertToArrayList;

public class Main {


    public static void main(String[] args) {
        System.out.println("Task_1");
        ChangeArray(new String[]{"str1", "str2", "str3", "str4", "str5"}, 1, 2);
        System.out.println();
        System.out.println("Task_2");
        String[] arr = new String[]{"str1", "str2", "str3", "str4", "str5"};
        List<String> listOfStrings = new ArrayList<String>();
        String str = "str6";
        convertToArrayList(arr, listOfStrings, str);
        System.out.println();

        System.out.println("Task_3");
        float weghtBox = 0.0f;
        Apple apple = new Apple();
        Orange orange = new Orange();
        Fruit fruit = new Fruit(0);
        Box <Fruit> fruitBox = new Box<>();

        Float[] apples = new Float[]{1.0f, 2.0f, 3.0f, 2.0f, 4.0f};
        ArrayList<Float> applList = new ArrayList<Float>(Arrays.asList(apples));
        Collections.addAll(applList);

        Float[] oranges = new Float[]{1.5f, 3.0f, 1.5f, 2.5f, 1.5f};
        ArrayList<Float> orangeList = new ArrayList<Float>(Arrays.asList(oranges));
        Collections.addAll(orangeList);


        Float[] fruits = new Float[]{1.5f, 3.0f, 1.5f, 2.5f, 1.5f, 2.0f, 1.0f, 1.0f};
        ArrayList<Float> fruitsList = new ArrayList<Float>(Arrays.asList(oranges));
        ArrayList<Float> fruitsList2 = new ArrayList<Float>(Arrays.asList(fruits));
        fruitBox.add(fruit);
        Collections.addAll(applList);

        Apple apple1 = new Apple();
        Orange orange1 = new Orange();
        float weightBoxApple = 0.0f;
        float weightBoxOrange = 0.0f;
        ArrayList<Apple> boxApple = new ArrayList<>();
        ArrayList<Orange> boxOrange = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            boxApple.add(apple1);
            boxOrange.add(orange1);
            weightBoxApple += apple1.getWeight();
            weightBoxOrange += orange1.getWeight();
        }

        System.out.println("Вес коробки  яблок: " + Fruit.weightBox(applList, 0.0f));
        System.out.println("Вес коробки  апельсин: " + Fruit.weightBox(orangeList, 0.0f));
        System.out.println("Вес коробки  фруктов_1: " + Fruit.weightBox(fruitsList, 0.0f));
        System.out.println("Вес коробки  фруктов_2: " + Fruit.weightBox(fruitsList2, 0.0f));
        System.out.println();
        System.out.println("Вес одного яблока: " + apple.getWeight() + "; " + "Вес одного апельсина: " + orange.getWeight());
        System.out.println("Вес коробки из 10-ти яблок: " + weightBoxApple + "\n" + "Вес коробки из 10-ти апельсин: " + weightBoxOrange);


    }



}





