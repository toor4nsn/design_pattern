package com.example.design.decorator;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.lang.reflect.Field;

public class Client {
    public static void main(String[] args) {
        FriedRice friedRice = new FriedRice();
        System.out.println(friedRice.getDesc() + " " + friedRice.cost() + "元");

        //加一个鸡蛋
        Egg eggRice = new Egg(friedRice);
        System.out.println(eggRice.getDesc() + " " + eggRice.cost() + "元");

        // 再加一个培根
        Bacon baconEggRice = new Bacon(eggRice);
        System.out.println(baconEggRice.getDesc() + " " + baconEggRice.cost() + "元");




        FriedNoodles friedNoodles = new FriedNoodles();
        System.out.println(friedNoodles.getDesc() + " " + friedNoodles.cost() + "元");

        Bacon baconFriedNoodles = new Bacon(friedNoodles);
        System.out.println(baconFriedNoodles.getDesc() + " " + baconFriedNoodles.cost() + "元");

        Egg eggBaconFriedNoodles = new Egg(baconFriedNoodles);
        System.out.println(eggBaconFriedNoodles.getDesc() + " " + eggBaconFriedNoodles.cost() + "元");
    }
}
