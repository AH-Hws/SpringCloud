package com.design.pattern.builder.demo1;

/**
 * @author Huws
 * @version v1.0
 * @ClassName Client
 * @Description
 * @date 2022/6/6 9:14
 **/
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("cpu")
                .memory("10")
                .builder();
        System.out.println(phone);
    }
}
