package com.xz.project1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.IntStream;

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
    private static double calPriceTotal(Car[] cars, int days) {
        double priceTotal = 0.0;
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
    private static int calPassengerCapacity(ArrayList cars) {
        int passengerCount = 0;
        for (int i = 0; i < cars.size(); i++) {
            Car car = (Car) cars.get(i);
            passengerCount += car.passengerCapacity;
        }
        return passengerCount;
    }

    /**
     * 计算总载重量
     *
     * @param cars 车数组
     * @return 总载重量
     */
    private static double calCargoCapacity(ArrayList cars) {
        double cargoCapacity = 0.0;
        for (int i = 0; i < cars.size(); i++) {
            Car car = (Car) cars.get(i);
            cargoCapacity += car.cargoCapacity;
        }
        return cargoCapacity;

    }

    /**
     * 租车系统欢迎界面
     * 打印欢迎语句, 输出所有车型及序号
     *
     * @param cars 车数组
     */
    private static void DadaCars(Car[] cars) {
        System.out.println("欢迎使用答答租系统!");
        Scanner input = new Scanner(System.in);
        System.out.println("你是否要租车: 1是  0否");
        try {
            Integer response = input.nextInt();
            if (response == 0) {
                System.out.println("欢迎下次使用!");
            } else {
                System.out.println("序号  车型  价格 容量");
                for (int index = 0; index < cars.length; index++) {
                    cars[index].carDetail(index + 1);
                }
            }
        } catch (InputMismatchException e) {
            System.out.printf("%s ;请输入1或者0!", e);
            System.exit(0);
        }
    }

    /**
     * 选车流程
     *
     * @return 租车的序列号
     */
    private static int[] getRentIndex(int count){
        Scanner input = new Scanner(System.in);
        int[] carsRentIndex = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.printf("请输入第%d车的序号%n", i + 1);
            try {
                int carIndex = input.nextInt();
                // 异常判断
                carsRentIndex[i] = carIndex;
            } catch (InputMismatchException e) {
                System.out.println("车的序号必须在1-6的范围内");
                System.exit(0);
            }
        }
        return carsRentIndex;
    }

    /**
     * 获取所需车的数量
     *
     * @return rentcount 租车数量
     */
    private static int getRentCount() {
        System.out.println("请输入需要车的数量");
        int response;
        Scanner input = new Scanner(System.in);
        response = input.nextInt();
        return response;
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
        Scanner input = new Scanner(System.in);

        DadaCars(cars);
        // 选车
        int[] carsRentIndex;
        int rentCount;
        rentCount = getRentCount();
        carsRentIndex = getRentIndex(rentCount);
        // 租车天数
        System.out.println("请输入租车的天数:");
        int day;
        day = input.nextInt();

        // 找出载客车和载货车
        ArrayList passengerCarRent = new ArrayList();
        ArrayList goodsCarRent = new ArrayList();
        Car[] carsRent = new Car[rentCount];
        int carRentIndex = 0;
        for (int i : carsRentIndex) {
            if (cars[i - 1].isCargo()) {
                goodsCarRent.add(cars[i - 1]);
            }
            if (cars[i - 1].isPassenger()) {
                passengerCarRent.add(cars[i - 1]);
            }
            carsRent[carRentIndex] = cars[i - 1];
            carRentIndex += 1;
        }

        // 统计订单信息

        System.out.println("您的订单信息:");
        System.out.println("***可载人的车有:");
        IntStream.range(0, passengerCarRent.size()).mapToObj(i -> (Car) passengerCarRent.get(i)).forEach(car -> System.out.printf("%s  ", car.name));
        System.out.printf("共载人 %d人%n", calPassengerCapacity(passengerCarRent));

        System.out.println("***载货的车有:");
        for (Object aGoodsCarRent : goodsCarRent) {
            Car car = (Car) aGoodsCarRent;
            System.out.printf("%s  ", car.name);
        }
        System.out.printf("共载货 %.2f吨%n", calCargoCapacity(goodsCarRent));

        System.out.printf("***租车的总价格为:%n %.2f", calPriceTotal(carsRent, day));
    }
}



