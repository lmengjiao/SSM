package spring07di;

public class Person {
    private Pad pad;

    public Person(){
        System.out.println("人对象被创建");
    }

    //有参构造注入
    public Person(Pad pad){
        this.pad=pad;
    }

    public void play(){
        System.out.println("人玩的方法");
        pad.game();
    }
}
