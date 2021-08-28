package spring18zuoye;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test02 {
    @Test
    public void test01(){
        Liu2 liu = new Liu2();
        Fang2 jdk= (Fang2) Proxy.newProxyInstance(liu.getClass().getClassLoader(),
                liu.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        boolean b = (boolean) method.invoke(liu, objects);
                        if(b!=true){
                            b=true;
                        }
                        return b;
                    }
                });
       boolean b=jdk.FangWen();
        System.out.println("b = " + b);
    }
}
