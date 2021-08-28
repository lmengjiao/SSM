package spring16aopjinhtaidaili;
//目标对象 一般不行 想让另一个对象帮他
public class Game {
    private int wangsu=460;

    public int getWangsu() {
        return wangsu;
    }

    public void setWangsu(int wangsu) {
        this.wangsu = wangsu;
    }

    //目标对象自身的方法是不行的 想要在不改变源代码的基础上 增强这个方法
    //目标对象的目的
    public void conNet(){
        System.out.println("游戏本身的网速是" + this.wangsu);
    }
}
