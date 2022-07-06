package com.design.pattern.decorator;

/**
 * @author Huws
 * @version v1.0
 * @ClassName FastFood
 * @Description 快餐类(抽象构件)
 * @date 2022/6/6 9:33
 **/
public abstract class FastFood {
    /**
     * 价格
      */
    private float price;

    /**
     * 描述
     */
    private String desc;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public FastFood(){}

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public abstract float cost();
}
