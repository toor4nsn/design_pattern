package com.example.design.template;

public abstract class AbstractClass {

    /**
     * 模板方法 定义
     * 注意，我们已经说过了，模板方法是定义了算法的骨架，而子类在继承父类时，是可以对该模板方法进行重写的，
     * 重写的话那就意味着子类可以去改变这个算法的骨架了，但是我们又不能让其去改变，所以我们就只好在该模板
     * 方法上加上final关键字进行修饰了。
     */
    public final void cookProcess(){
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    /**
     * 第一步：倒油，属于具体方法。
     * 不管炒啥都是一样的，所以直接实现
     */
    public void pourOil() {
        System.out.println("倒油");
    }

    /**
     * 第二步：热油，属于具体方法。
     * 不管炒啥都是一样的，所以直接实现
     */
    public void heatOil() {
        System.out.println("热油");
    }

    /**
     * 第三步：倒蔬菜，属于抽象方法。
     * 注意了，炒菜时倒的蔬菜是不一样的，例如爆炒包菜时倒的是包菜，爆炒菜心时倒的是菜心
     */
    public abstract void pourVegetable();

    /**
     * 第四步：倒调味料，属于抽象方法。
     * 既然炒菜时倒的蔬菜是不一样的，那么倒的调味料也必然是不一样的了
     */
    public abstract void pourSauce();

    /**
     * 第五步：翻炒，属于具体方法。
     * 不管炒啥都是一样的，所以直接实现
     */
    public void fry() {
        System.out.println("炒啊炒啊炒到熟啊");
    }
}
