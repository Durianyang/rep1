package com.jsdx.builder.test;

public class MySmartPhoneDirector implements SmartPhoneDirector
{
    private MySmartPhoneBuilder builder;

    public MySmartPhoneDirector(MySmartPhoneBuilder builder)
    {
        this.builder = builder;
    }

    @Override
    public SmartPhone directSmartPhone()
    {
        CPU cpu = builder.BuilderCPU();
        Camera camera = builder.BuilderCamera();
        Screen screen = builder.BuilderScreen();
        SmartPhone smartPhone = new SmartPhone();
        System.out.println("组装CPU");
        smartPhone.setCpu(cpu);
        System.out.println("组装摄像头");
        smartPhone.setCamera(camera);
        System.out.println("组装屏幕");
        smartPhone.setScreen(screen);

        return smartPhone;
    }
}
