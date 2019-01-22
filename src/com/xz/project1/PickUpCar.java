package com.xz.project1;

/**
 * 皮卡车
 *
 * @author zs
 * @date 2019/1/22
 *
 */
public class PickUpCar extends Car{
    PickUpCar(String name, double price, int passengerCapacity, double cargoCapacity) {
        this.name = name;
        this.price = price;
        this.passengerCapacity = passengerCapacity;
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void carDetail() {
        System.out.println(this.name + "  " + this.price + "元/天" +
                "  " +
                "载客量: " + this.passengerCapacity +
                " 载货量: " + this.cargoCapacity );
    }
}
