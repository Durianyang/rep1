package com.jsdx.builder.test;

/**
 * 构建各个组件
 */
public interface SmartPhoneBuilder
{
    CPU BuilderCPU();
    Screen BuilderScreen();
    Camera BuilderCamera();
}
