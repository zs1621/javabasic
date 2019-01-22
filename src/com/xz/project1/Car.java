package com.xz.project1;

/**
 * 车型父类
 *
 * @author zs
 * @date 2019/1/22
 */
public class Car {
    /**
    载客量
     */
    int passengerCapacity;
    /**
    载货量
    */
    double cargoCapacity;
    /**
     价格  元/天
     */
    double price;
    String name;

    public void carDetail(int index) {}

    /**
    是否可载客
     */
    public boolean isPassenger() {
        return false;
    }

    /**
    是否可载货
     */
    public boolean isCargo() {
        return false;
    }
}
