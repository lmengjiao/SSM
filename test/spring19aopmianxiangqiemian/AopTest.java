package spring19aopmianxiangqiemian;

import org.junit.Test;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

public class AopTest {
    @Test
    public void test01(){
        PaiDui paiDui = new PaiDui(); //次要业务
        paiDui.paihao();

        BankServiceImpl bank = new BankServiceImpl(); //主要业务
        bank.cunqian();
    }

    @Test
    //使用动态代理解决 切面类+主要业务 组合在一起
    public void test02(){
        //排队
        //存钱
        //1.目标对象
        BankService bankService = new BankServiceImpl();
        //2.代理对象
        BankService bankService1=(BankService)Proxy.newProxyInstance(bankService.getClass().getClassLoader(),
                bankService.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                       //在这里可以增强目标对象 其实就是把切面类直接拿过来
                        PaiDui.paihao();
                        Object invoke = method.invoke(bankService, objects);
                        return invoke;
                    }
                });
        bankService1.cunqian();
    }
}
