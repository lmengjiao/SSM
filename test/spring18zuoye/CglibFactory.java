package spring18zuoye;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibFactory implements MethodInterceptor {
    private Liu3 liu;
    public CglibFactory(){
        liu=new Liu3();
    }

    public Liu3 cglibCreator(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Liu3.class);
        enhancer.setCallback(this);
        return (Liu3) enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        boolean b = (boolean) method.invoke(liu, objects);
        b=true;
        return b;
    }
}
