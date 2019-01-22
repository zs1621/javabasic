package com.xz.project1;

/**
 * 载货车
 *
 * @author zs
 * @date 2019/1/22
 */

public class GoodsCar extends Car{
    GoodsCar(String name, double price, double cargoCapacity){
        this.name = name;
        this.price = price;
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void carDetail() {
        System.out.println(this.name + "  " + this.price + "元/天" +
                "  " +  "载货量: " + this.cargoCapacity);
    }
}
