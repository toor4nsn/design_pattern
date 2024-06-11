package com.example.design.builder;

/**
 * 手机类
 * @author liayun
 * @create 2021-06-03 6:41
 */
public class Phone {

    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    // 私有构造方法
    private Phone(Builder builder) { // 构造方法里面需要传入一个构建器
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainboard = builder.mainboard;
    }

    public static final class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        /**
         * 大家可以看到，方法名是和以上成员变量（或者属性）的名称保持一致的，并且方法最终返回的就是咱们的Builder
         * @param cpu
         * @return
         */
        public Builder cpu(String cpu) {
            this.cpu = cpu; // 把方法中的参数设置给成员变量
            return this; // 因为方法的返回值类型是Builder，所以我们得返回一个Builder对象，这样，不妨直接返回当前对象就哦了
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder mainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }

        // 使用构建者创建Phone对象
        public Phone build() {
            // 在内部类中是可以直接去访问外部类中私有的方法的
            return new Phone(this); // 记住，我们要把当前对象（即this）给其传递过去，因为Phone类
                                    // 中只提供了一个构造方法，而且方法参数要的还是Builder对象
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainboard='" + mainboard + '\'' +
                '}';
    }

}
