package spring12zhujie;

import org.springframework.stereotype.Component;
//这四个 简称四大注解
@Component //通用注解
//@Controller //=@Component 用在Controller层
//@Service //=@Component 用在Service层
//@Repository //=@Component 用在dao层 但是一般不用 因为dao层有xml映射
public class Woman {
    public Woman(){
        System.out.println("女人诞生了");
    }
}
