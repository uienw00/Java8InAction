package chapter1;

import chapter1.model.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by uienw on 2016-07-04.
 */
public class FilterApple {
    public interface Predicate<T>{
        boolean test(T t);
    }

    static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
