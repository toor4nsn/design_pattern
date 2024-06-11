package com.example.design.factory.simple_factory;

import com.example.design.factory.before.Coffee;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * @author liayun
 * @create 2021-06-01 22:26
 */
public class CoffeeFactory {
    /**
     * 我们所要所做的事情，就是加载配置文件，然后去获取配置文件中配置的全类名，并创建该类的对象进行存储。
     */

    // 1. 定义容器对象存储咖啡对象
    /*
     * 容器选择双列集合
     *      键：（咖啡）名称
     *      值：咖啡对象
     */
    private static HashMap<String, Coffee> map = new HashMap<String, Coffee>();

    // 2. 加载配置文件中的全类名，并通过反射创建对象进行存储，注意，配置文件只需要加载一次。
    // 由于配置文件只需要加载一次，所以我们最好将代码写在静态代码块里面
    static {
        // 2.1 创建Properties对象
        Properties p = new Properties();
        // 2.2 调用p对象的load方法进行配置文件的加载，注意，配置文件（即bean.properties）是在类路径下面哟！
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            p.load(is);
            // 从p集合中获取全类名并创建对象
            Set<Object> keys = p.keySet();
            for (Object key : keys) {
                // 获取到全类名
                String className = p.getProperty((String) key);
                // 通过反射技术创建对象
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                // 将名称和对象存储到容器中
                map.put((String) key, coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据名称获取Coffee对象
     * @param name：咖啡的名称
     * @return
     */
    public static Coffee createCoffee(String name) {
        return map.get(name);
    }

}
