package spring21zuoye;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Message2 {

        public void before(){
            System.out.println("插播广告");
        }

        public void after(){
            System.out.println("亲 办理会员可以看VIP");
        }

        public void arround(ProceedingJoinPoint pj){
            System.out.println("验证一下");
        try {
            Object proceed = pj.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
            System.out.println("转账成功");
        }

        public void throwing(JoinPoint joinPoint,Exception e){
            System.out.println("视频已失踪，推荐你看其他同类视频");
        }

        public void final1(){
            System.out.println("最终通知");
        }
    }


