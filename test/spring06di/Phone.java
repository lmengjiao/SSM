package spring06di;
/*
我是手机对象 是一个次要类 是被主体人类来依赖的
 */
public class Phone implements PlayGame{
    public Phone(){
        System.out.println("手机对象诞生了");
    }

    public void game(){
        System.out.println("手机可以玩游戏");
    }
}
