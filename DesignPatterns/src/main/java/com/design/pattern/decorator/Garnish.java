package com.design.pattern.decorator;

/**
 * @author Huws
 * @version v1.0
 * @ClassName Garnish
 * @Description 抽象装饰
 * @date 2022/6/6 10:13
 **/
public abstract class Garnish extends FastFood {

    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood, float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
