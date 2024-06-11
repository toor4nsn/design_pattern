package com.example.design.singleton.demo4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 静态内部类方式
 * @author liayun
 * @create 2021-05-29 19:17
 */
public class Singleton {
    // 私有构造方法
    private Singleton() {}

    // 定义一个静态内部类
    //只有内部类的属性或者方法被调用时才会被加载，并初始化其静态属性。
    private static class SingletonHolder {
        // 在内部类中声明并初始化外部类的对象
        // 为了防止外界对该静态属性进行修改，故在其上加了一个final关键字，也即意味着它就是一个常量了
        private static final Singleton INSTANCE = new Singleton();
    }

    // 提供公共的访问方式
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }


    /**
     * 反射破坏单例模式
     * @param args
     */
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Singleton> clazz = Singleton.class;
        Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton s1 = constructor.newInstance();
        Singleton s2 = constructor.newInstance();
        System.out.println(s1 == s2);
    }

}
