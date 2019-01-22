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
    public void carDetail(int index) {
        System.out.printf("%d  %s  %s元/天  载客量: %d 载货量: %s%n",
                index, this.name, this.price,
                this.passengerCapacity, this.cargoCapacity);
    }

    @Override
    public boolean isCargo() {
        return true;
    }

    @Override
    public boolean isPassenger() {
        return true;
    }
}
