package com.design.pattern.decorator;

/**
 * @author Huws
 * @version v1.0
 * @ClassName Bacon
 * @Description 培根（具体装饰）
 * @date 2022/6/6 10:20
 **/
public class Bacon extends Garnish {
    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "培根");
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return getDesc() + getFastFood().getDesc();
    }
}
