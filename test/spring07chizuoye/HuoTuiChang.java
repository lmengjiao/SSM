package spring07chizuoye;

public class HuoTuiChang implements Chide{
    public HuoTuiChang(){
        System.out.println("火腿肠诞生了");
    }

    @Override
    public void chide() {
        System.out.println("吃火腿肠");
    }
}
