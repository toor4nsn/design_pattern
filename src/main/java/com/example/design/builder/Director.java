package com.example.design.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    // 组装自行车的功能
    public Bike construct(){
        builder.buildSeat();
        builder.buildFrame();
        return builder.createBike();
    }

}
