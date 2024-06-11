package com.example.design.jdk_proxy;

/**
 * @author liayun
 * @create 2021-06-21 21:16
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxyObject = proxyFactory.getProxyObject();

        proxyObject.sell();
    }
}
