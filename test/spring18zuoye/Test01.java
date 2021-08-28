package spring18zuoye;

import org.junit.Test;

public class Test01 {
    @Test
    public void test01(){
        Liu1 liu1 = new Liu1();
        Vpn1 vpn1 = new Vpn1();
        vpn1.setLiu1(liu1);
        vpn1.FangWen();
    }
}
