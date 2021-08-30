package spring19aopmianxiangqiemian;
//经过上述的推论 静态方法和接口都被否决
//把次要业务提取成一个对象 这个对象就是切面
public class BankServiceImpl implements BankService{
   @Override
    public void cunqian(){
        System.out.println("存钱 主要业务");
    }
}
