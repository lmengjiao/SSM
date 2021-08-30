package spring21zuoye;

import org.junit.Test;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

public class Test01 {
    @Test
    public void test01(){
        VideoServiceImpl1 impl = new VideoServiceImpl1();
        VideoService1 service=(VideoService1) Proxy.newProxyInstance(impl.getClass().getClassLoader(),
                impl.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        Message1.before();
                        Message1.final1();
                       Message1.arround();
                        Message1.final1();
                        Object invoke = method.invoke(impl, objects);
                        Message1.throwing();
                        Message1.final1();
                        Message1.arround();
                        Message1.final1();
                        Message1.after();
                        Message1.final1();
                        return invoke;
                    }
                });
        service.start();
        service.stop();
        service.trans();
        service.lose();
    }
}
