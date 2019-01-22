package com.xz.project1;

import java.util.Scanner;

/**
 * 答答租车系统
 *
 * @author zs
 * @date 2019/1/22
 */
public class DaDa {

    /**
     * 计算总价
     *
     * @param cars 所选车型列表
     * @param days 所需天数
     * @return 总价格
     */
    public double calPriceTotal(Car[] cars, int days) {
        Double priceTotal = 0.0;
        for (Car car : cars) {
            priceTotal += car.price * days;
        }
        return priceTotal;
    }

    /**
     * 计算总载客量
     *
     * @param cars 所选车型列表
     * @return 总载客量
     */
    public int calPassengerCapacity(Car[] cars) {
        int passengerCount = 0;
        for (Car car : cars) {
            passengerCount += car.passengerCapacity;
        }
        return passengerCount;
    }

    public static void main(String[] strings) {

        Car[] cars = {
                new PassengerCar("奥迪A4 ", 500, 4),
                new GoodsCar("马自达6", 400, 4),
                new PickUpCar("皮卡雪6", 450, 4, 2),
                new PassengerCar("金龙", 800, 20),
                new GoodsCar("松花江", 400, 4),
                new GoodsCar("依维柯", 1000, 20)
        };
        System.out.println("欢迎使用答答租系统!");
        Scanner input = new Scanner(System.in);
        System.out.println("你是否要租车: 1是  0否");
        Integer response = input.nextInt();
        if (response == 0) {
            System.out.println("欢迎下次使用!");
        } else {
            System.out.println("序号  车型  价格 容量");
            for (int index = 0; index < cars.length; index++) {
                cars[index].carDetail(index + 1);
            }
            // 选车
            System.out.println("请输入需要车的数量");
            response = input.nextInt();
            int[] carsRentIndex = new int[response];
            for (int i = 0; i < response; i++) {
                System.out.printf("请输入第%d车的序号%n", i + 1);
                int carIndex = input.nextInt();
                // 异常判断
                carsRentIndex[i] = carIndex;
            }
        }


    }
}
