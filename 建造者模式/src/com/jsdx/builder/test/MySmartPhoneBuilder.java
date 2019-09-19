package com.jsdx.builder.test;

public class MySmartPhoneBuilder implements SmartPhoneBuilder
{

    @Override
    public CPU BuilderCPU()
    {
        System.out.println("构建CPU");
        return new CPUFactory().createCPU();
    }

    @Override
    public Screen BuilderScreen()
    {
        System.out.println("构建屏幕");
        return new ScreenFactory().createScreen();
    }

    @Override
    public Camera BuilderCamera()
    {
        System.out.println("构建摄像头");
        return new CameraFactory().createCamera();
    }
}
