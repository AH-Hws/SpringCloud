package com.design.pattern.bridge;

/**
 * @author Huws
 * @version v1.0
 * @ClassName Client
 * @Description
 * @date 2022/6/6 11:55
 **/
public class Client {

    public static void main(String[] args) {
        OpratingSystem system = new Windows(new AviFile());
        system.play("555");
    }
}
