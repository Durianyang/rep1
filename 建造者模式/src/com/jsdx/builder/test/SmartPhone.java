package com.jsdx.builder.test;

public class SmartPhone
{
    //CPU
    private CPU cpu;
    //摄像头
    private Camera camera;
    //屏幕
    private Screen screen;

    public void startingUp()
    {
        System.out.println("SmartPhone开机");
    }

    public void shutdown()
    {
        System.out.println("SmartPhone关机");
    }

    public SmartPhone() {}

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }
}
