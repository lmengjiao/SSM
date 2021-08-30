package spring21zuoye;

public class Message1 {
    public static void before(){
        System.out.println("插播广告");
    }

    public static void after(){
        System.out.println("亲 办理会员可以看VIP");
    }

    public static void arround(){
        System.out.println("验证一下");
//        try {
//            Object proceed = pj.proceed();
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
        System.out.println("转账成功");
    }

    public static void throwing(){
        System.out.println("视频已失踪，推荐你看其他同类视频");
    }

    public static void final1(){
        System.out.println("最终通知");
    }
}
