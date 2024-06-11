package com.example.design.builder;

public class Client {
    public static void main(String[] args) {

//        Director director = new Director(new MobileBuilder());
        Director director = new Director(new OfoBuilder());
        Bike bike = director.construct();
        String seat = bike.getSeat();
        String frame = bike.getFrame();
        System.out.println(seat);
        System.out.println(frame);


        // 创建手机对象   通过构建者对象获取手机对象
        Phone phone = new Phone.Builder()
                .cpu("intel") // 由于cpu、screen等这些方法返回的都是当前对象，所以我们就可以使用链式编程了
                .screen("三星屏幕")
                .memory("金士顿内存条")
                .mainboard("华硕主板")
                .build();
        System.out.println(phone);
    }
}
