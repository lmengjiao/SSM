package spring19aopmianxiangqiemian;
/*
我就是切面类 切面类和普通类有什么区别
1.逻辑上 切面类是次要业务 普通类可能是主要业务
2.写法上 一般切面类 里面很少有属性 只有方法
 */
//切面类就是通知
public class PaiDui {
    public static void paihao(){
        System.out.println("排号 次要业务");
    }
}
