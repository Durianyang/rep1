package com.jsdx.builder.test;

/**
 * 简单建造者模式混合工厂模式
 */
public class Client
{
    public static void main(String[] args)
    {
        SmartPhoneDirector director = new MySmartPhoneDirector(new MySmartPhoneBuilder());
        SmartPhone smartPhone = director.directSmartPhone();
        smartPhone.startingUp();

        System.out.println(smartPhone.getCpu().getName() + " " + smartPhone.getCamera().getName()
                + " " + smartPhone.getScreen().getName());
        smartPhone.shutdown();


    }
}
