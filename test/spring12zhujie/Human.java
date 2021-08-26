package spring12zhujie;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component //这个注解就等于在xml中写了bean标签
@Component("ren") //起别名 如果不起就是类名的首字母小写
@Scope("prototype") //原型模式 <bean id="pc" class="spring04iocrongqi.Pc" scope="prototype">
@Lazy(true) //延迟加载 默认是true <bean id="tea" class="spring05yanchijiazai.Tea" lazy-init="true"></bean>
public class Human {
    //构造方法不能私有
    public Human(){
        System.out.println("人类诞生了");
    }

    @PostConstruct //构造器之前的方法 意思就是生命周期
    //<bean id="pc" class="spring04iocrongqi.Pc" init-method="initShow" destroy-method="destory"></bean>
    public void initShow(){
        System.out.println("哭...");
    }

    @PreDestroy //<bean id="pc" class="spring04iocrongqi.Pc" init-method="initShow" destroy-method="destory"></bean>
    public void destory(){
        System.out.println("临死前的遗嘱");
    }
}
