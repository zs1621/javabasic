package com.xz.project1;

import java.util.Scanner;

/**
 * 答答租车系统
 *
 * @author zs
 * @date 2019/1/22
 */
public class DaDa {
    public static void main(String[] strings) {

        Car[] cars = {
                new PassengerCar("奥迪A4 ", 500, 4),
                new GoodsCar("马自达6", 400, 4),
                new PickUpCar("皮卡雪6",450, 4, 2),
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
            for (Car car:cars) {
                car.carDetail();
            }
        }
    }
}
