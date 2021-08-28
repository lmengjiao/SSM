package spring18cglibdongtaidaili;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibFactory implements MethodInterceptor {
    private Man man;
    public CglibFactory(){
         man = new Man();
    }

    //在医院中生产子类
    //收集DNA 方法的拦截
    public Man cglibCreator(){
        //1.字节码的增强器
        Enhancer enhancer = new Enhancer();
        //2.指定一个父亲
        enhancer.setSuperclass(Man.class);
        //3.调用工厂
        enhancer.setCallback(this);
        //4.创建enhancer
        return (Man) enhancer.create();
    }

    //方法的拦截 实现他爹的梦想
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Integer integer = (Integer) method.invoke(man, objects);
        integer=integer+410;
        return integer;
    }



}
