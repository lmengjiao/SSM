package spring21aopzhujie;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("logAspect")
@Aspect //代表是一个切面
public class LogAspect {
    @Pointcut("execution(* spring21aopzhujie.*.*(..))")
    public void pt(){
        System.out.println("切入点表达式");
    }

    @Before("pt()")
    public void beforeMsg(){
        System.out.println("前置通知");
    }
    
    @AfterReturning("pt()")
    public void afterMsg(){
        System.out.println("后置通知");
    }
    
    //@Around("pt()")
    public void aroundMsg(ProceedingJoinPoint pj){
        System.out.println("环绕通知 前");
        try {
            Object proceed = pj.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕通知 后");
    }

    @AfterThrowing(value="pt()",throwing="e")
    public void throwing(JoinPoint joinPoint, Exception e){
        System.out.println("异常通知");
        System.out.println("e.getMessage() = " + e.getMessage());
    }

    @After("pt()")
    public void afterFinal(){
        System.out.println("最终通知");
    }
}
