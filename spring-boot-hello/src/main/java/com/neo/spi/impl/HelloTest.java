package com.neo.spi.impl;

import com.neo.spi.HelloSPI;

public class HelloTest implements HelloSPI {
    @Override
    public String sayHello() {
        return "The Best";
    }
}
