package chapter2;

import chapter1.model.Apple;

/**
 * Created by uienw on 2016-07-05.
 */
public class AppleSimpleFormatter implements AppleFomatter {
    @Override
    public String accespt(Apple apple) {
        return "An apple of " + apple.getWeight() + "g";
    }
}
