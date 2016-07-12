package study.chapter2;

import study.chapter1.model.Apple;

/**
 * Created by uienw on 2016-07-05.
 */
public class AppleFancyFormatter implements AppleFomatter {
    @Override
    public String accespt(Apple apple) {
        String characteristic = apple.getWeight() > 150 ? "heavy" : "light";
        return "A " + characteristic + " " + apple.getColor() + " apple";
    }
}
