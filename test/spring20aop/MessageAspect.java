package spring20aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

//短信通知 统称为切面类
public class MessageAspect {
    public void sendMsg(){
        System.out.println("给顾客发送一条通知");
    }

    //环绕通知
    public void roundMsg(ProceedingJoinPoint pj){
        sendMsg();
        try {
            Object proceed = pj.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("我记录了转账记录");
    }

    public void sendMsgError(JoinPoint joinPoint, Exception e){
        System.out.println("异常通知");
    }

    //最终通知
    public void finalMsg(){
        System.out.println("最终通知");
    }
}
