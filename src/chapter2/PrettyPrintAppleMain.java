package chapter2;

import chapter1.model.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by uienw on 2016-07-05.
 */
public class PrettyPrintAppleMain {
    public static void prettyPrintApple(List<Apple> inventory, AppleFomatter formatter){
        for(Apple apple : inventory){
            String output = formatter.accespt(apple);
            System.out.println(output);
        }
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> result = new ArrayList<T>();
        for(T e: list){
            if(p.test(e)){
                result.add(e);
            }
        }
        return result;
    }
    public static void main(String[] args){
        List<Apple> inventory = new ArrayList<>();
        Apple apple = new Apple();
        apple.setColor("red");
        apple.setWeight(160);
        inventory.add(apple);

        Apple apple2 = new Apple();
        apple2.setColor("green");
        apple2.setWeight(130);
        inventory.add(apple2);
        prettyPrintApple(inventory, new AppleFancyFormatter());
        prettyPrintApple(inventory, new AppleSimpleFormatter());

        List<Apple> redApples = filter(inventory, (Apple a) -> "red".equals(a.getColor()));

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        List<Integer> evenNumbers =  filter(numbers, (Integer i) -> i % 2 == 0);

        inventory.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
        System.out.println("==========================");

        Thread t = new Thread(() -> System.out.println("Hello world"));
    }
}
