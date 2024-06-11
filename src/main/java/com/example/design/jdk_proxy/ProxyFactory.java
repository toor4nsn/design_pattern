package com.example.design.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 获取代理对象的工厂类，代理类也实现了对应的接口
 * @author liayun
 * @create 2021-06-21 23:26
 */
public class ProxyFactory {
    // 声明目标对象，目标对象就是火车站类对象
    private TrainStation station = new TrainStation();

    /**
     * 既然ProxyFactory是工厂类，那么毋庸置疑，在它里面我们需要提供一个获取代理对象的方法
     * @return 大家要记住，代理类也实现了对应的接口，因此该方法的返回值类型我们就写为了SellTickets接口
     */
    // 获取代理对象的方法
    public SellTickets getProxyObject() {
        // 返回代理对象。那么代理对象如何去创建呢？
        /*
         * Proxy类中的newProxyInstance方法所需要的三个参数：
         *      ClassLoader loader：类加载器，用于加载代理类（我们说了，代理类是在程序运行过程中动态的在内存中生成的），可以通过目标对象获取类加载器
         *      Class<?>[] interfaces：代理类实现的接口的字节码对象。由于目标对象所属类也实现了同样的接口，所以我们可以通过目标对象来获取对应接口的字节码对象
         *      InvocationHandler h：代理对象的调用处理程序。不过要注意，InvocationHandler是一个接口，所以你不妨以匿名内部类的形式将该参数体现出来
         */
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    /*
                     * invoke方法中的参数：
                     *      Object proxy：代理对象，和proxyObject对象是同一个对象哟，只不过它在invoke方法中基本不用
                     *      Method method：对接口中的方法进行封装的Method对象。在本案例中，它表示的就是sell方法，当然，如果接口里面还有其他方法的话，那么通过代理对象也能调用其他的方法
                     *      Object[] args：调用方法的实际参数。在本案例中，我们在调用sell方法时是没有传递任何参数的，所以这块的args参数并没有封装对应的数据。
                     *                     如果你有传递实际参数，那么args参数封装的就是你传递的实际参数
                     *
                     * 返回值：方法的返回值
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // System.out.println("invoke方法执行了");
                        // return null;
                        System.out.println("代售点收取一定的服务费用（JDK动态代理）");
                        // 执行目标对象（即火车站类对象）的方法
                        Object obj = method.invoke(station, args);
                        return obj; // 注意，目前我们通过代理对象调用sell方法时是没有返回值的，所以invoke方法返回的就是null
                    }
                }
        );
        return proxyObject;
    }
}
