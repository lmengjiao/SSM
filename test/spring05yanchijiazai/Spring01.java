package spring05yanchijiazai;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring01 {
    @Test
    public void test01(){
        //1.加载容器的xml
        String xml="spring05yanchijiazai/applicationContext.xml";
        ClassPathXmlApplicationContext cpxa = new ClassPathXmlApplicationContext(xml);
        System.out.println("cpxa = " + cpxa); //是否出现茶叶类延迟加载
    }
}
