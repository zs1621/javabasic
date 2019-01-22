package com.xz.project1;

/**
 * 载人客车
 *
 * @author zs
 * @date 2019/1/22
 */
public class PassengerCar extends Car{
    PassengerCar(String name, int price, int passengerCapacity) {
        this.name = name;
        this.price = price;
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void carDetail() {
        System.out.println(this.name + "  " + this.price + "元/天" +
                "  " +  "载客量: " + this.passengerCapacity);
    }
}
