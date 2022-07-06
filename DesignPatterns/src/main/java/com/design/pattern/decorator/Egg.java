package com.design.pattern.decorator;

/**
 * @author Huws
 * @version v1.0
 * @ClassName Egg
 * @Description 鸡蛋（具体装饰）
 * @date 2022/6/6 10:16
 **/
public class Egg extends Garnish {

    public Egg(FastFood fastFood) {
        super(fastFood, 1, "鸡蛋");
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
