package com.design.pattern.decorator;

/**
 * @author Huws
 * @version v1.0
 * @ClassName Client
 * @Description
 * @date 2022/6/6 10:25
 **/
public class Client {

    public static void main(String[] args) {
        FastFood fastFood = new FriedRice();
        System.out.println(fastFood.getDesc() + "  " + fastFood.cost());
        fastFood = new Egg(fastFood);
        System.out.println(fastFood.getDesc() + "  " + fastFood.cost());
    }
}
