package spring08zidongzhuangpei;

public class Computer implements GameInterface{
    public Computer(){
        System.out.println("电脑诞生了");
    }

    public void game(){
        System.out.println("电脑可以玩游戏");
    }
}
