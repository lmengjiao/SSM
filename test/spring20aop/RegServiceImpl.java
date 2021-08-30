package spring20aop;

public class RegServiceImpl implements RegService {
    @Override
    public void addUser() {
        System.out.println("这是注册功能");
        //注册完毕后发送一个短信
    }

    @Override
    public void loginUser(){
        System.out.println("这是登录功能");
    }

    @Override
    public void transMoney(){
        int i=9/0;
        System.out.println("这是转账功能");
    }
}
