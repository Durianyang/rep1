package com.jsdx.builder.test;

public class CameraFactory implements CameraCreateFactory
{
    @Override
    public Camera createCamera()
    {
        return new Camera("莱卡");
    }
}
