package com.jsdx.builder.test;

public class ScreenFactory implements ScreenCreateFactory
{
    @Override
    public Screen createScreen()
    {
        return new Screen("三星");
    }
}
