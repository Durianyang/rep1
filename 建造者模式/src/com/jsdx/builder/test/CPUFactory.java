package com.jsdx.builder.test;

public class CPUFactory implements CPUCreateFactory
{

    @Override
    public CPU createCPU()
    {
        return new CPU("骁龙");
    }
}
