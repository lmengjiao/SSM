package spring04iocrongqi;

public class Pc {
    //构造方法
    public Pc(){
        System.out.println("无参构造是对象一诞生就会执行的方法，比如人一出生就会哭，这个哭就是构造方法");
        System.out.println("构造方法是对象一诞生就会执行的方法 一般用来初始化自己的属性 比如颜色");
    }

    //初始化方法
    public void initShow(){
        System.out.println("初始化方法是对象一诞生就会执行的方法 和构造方法不同的是它多用来直接调用自己的方法 例如电脑的初始化方法是开机");
    }

    //普通方法
    public void playGame(){
        System.out.println("电脑的普通方法 打游戏");
    }

    //死亡方法
    public void destory(){
        System.out.println("对象死亡了");
    }
}
