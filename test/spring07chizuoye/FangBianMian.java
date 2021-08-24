package spring07chizuoye;

public class FangBianMian implements Chide{
    public FangBianMian(){
        System.out.println("方便面诞生了");
    }

    @Override
    public void chide() {
        System.out.println("吃方便面");
    }
}
