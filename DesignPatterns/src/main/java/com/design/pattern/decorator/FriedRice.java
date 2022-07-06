package com.design.pattern.decorator;

/**
 * @author Huws
 * @version v1.0
 * @ClassName FriedRice
 * @Description 炒饭(具体构件)
 * @date 2022/6/6 9:38
 **/
public class FriedRice extends FastFood {

    public FriedRice() {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
