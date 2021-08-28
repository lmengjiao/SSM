package spring18zuoye;

import org.junit.Test;

public class Test03 {
    @Test
    public void test01(){
        Liu3 liu = new CglibFactory().cglibCreator();
        boolean b=liu.Fang();
        System.out.println("b = " + b);
    }
}
