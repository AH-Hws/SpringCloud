package com.design.pattern.decorator;

/**
 * @author Huws
 * @version v1.0
 * @ClassName FriedNoodles
 * @Description 炒面（具体构件）
 * @date 2022/6/6 9:42
 **/
public class FriedNoodles extends FastFood {

    public FriedNoodles() {
        super(20, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
