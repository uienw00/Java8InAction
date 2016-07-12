package study.chapter1;

import study.chapter1.model.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by uienw on 2016-07-04.
 */
public class FilterAppleMain {
    public static void main(String[] args){
        List<Apple> inventory = new ArrayList();
        Apple apple1 = new Apple();
        apple1.setColor("green");
        apple1.setWeight(100);
        inventory.add(apple1);
        Apple apple2 = new Apple();
        apple2.setColor("green");
        apple2.setWeight(160);
        inventory.add(apple2);
        Apple apple3 = new Apple();
        apple3.setColor("red");
        apple3.setWeight(170);
        inventory.add(apple3);
        Apple apple4 = new Apple();
        apple4.setColor("red");
        apple4.setWeight(100);
        inventory.add(apple4);

        List<Apple> appleGreenList = FilterApple.filterApples(inventory, (Apple a) ->"green".equals(a.getColor()));
        System.out.println("=======================");
        for(Apple apple : appleGreenList){
            System.out.println(apple.getColor());
            System.out.println(apple.getWeight());
        }

        List<Apple> appleWeightList = FilterApple.filterApples(inventory, (Apple a) ->a.getWeight() > 150);
        System.out.println("=======================");
        for(Apple apple : appleWeightList){
            System.out.println(apple.getColor());
            System.out.println(apple.getWeight());
        }

        List<Apple> heavyApples1 = inventory.stream().filter((Apple a) -> a.getWeight() > 150)
                .collect(Collectors.toList());
        System.out.println("=======================");
        for(Apple apple : heavyApples1){
            System.out.println(apple.getColor());
            System.out.println(apple.getWeight());
        }

        List<Apple> heavyApples2 = inventory.parallelStream().filter((Apple a) -> a.getWeight() > 150)
                .collect(Collectors.toList());
        System.out.println("=======================");
        for(Apple apple : heavyApples2){
            System.out.println(apple.getColor());
            System.out.println(apple.getWeight());
        }
    }
}
