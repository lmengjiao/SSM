package spring16aopjinhtaidaili;

import org.junit.Test;

public class Test01 {
    @Test
    public void test01(){
        Game wangzhe=new Game();
        JiaSuQi xunyou = new JiaSuQi();
        xunyou.setGame(wangzhe); //set注入 王者注入迅游 迅游依赖了王者 迅游包含了王者 迅游才是主题
        xunyou.conNet();
    }

    @Test
    public void test02(){
        BeiGaoren lisi = new BeiGaoren();
        LvShi heyunchen = new LvShi();
        heyunchen.setBeiGaoren(lisi);
        heyunchen.ChengGong();
    }

}
