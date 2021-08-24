package spring01danyuanceshi;

import org.junit.Test;

public class Spring01 {

    @Test
    public void test01(){
        System.out.println("我是单元测试，" +
                "单元测试的写法是@Test注解 来自于org.junit.Test这个包 必须是void静态 没有返回值的方法" +
                "方法名和类名不可以起test() Test.java" +
                "单元测试是代替main方法测试 main方法测试有一定的局限性 例如无法测试web项目");
    }
}
//反射 是在JVM虚拟机的类加载中 .java -->class文件 在这个转换期间
//JVM 可以看到类的所有信息 比如属性，方法，父类，接口等
//反射就是对于任意一个对象都能够调用它的任意方法和属性
//这样动态获取信息以及动态调用对象方法的功能 叫做Java的反射机制 不是我们通常讲的光线反射的反射
//为什么要学反射？ ①反射是Spring框架的底层实现 ②反射可以解耦
//什么是解耦？ 解耦就是解决程序之间的耦合
//什么是耦合？ 耦合就是程序之间过于依赖
//什么是依赖？ 依赖就是A程序调用B程序 A程序中有B程序方法调用

