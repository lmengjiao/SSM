package spring02ouhe;

//工厂模式 spring创建bean的底层 使用工厂模式代码更加灵活
public class FactoryBean {
//    public static Usb getInstance(String beanName) throws Exception {
//        Usb usb=null;
        //用反射 把死的if写成活的
        //反射的优势 一行代码 代替所有
//            Class<?> aClass = Class.forName(beanName); //动态加载类
//            usb = (Usb)aClass.newInstance();  //实例化对象
//            return usb;

//        if(beanName.equals("Computer01")){
//            usb=new Computer01();
//        }else if(beanName.equals("Tv01")){
//            usb=new Tv01();
//        }
//       return usb;
//        //按照这个架构会出现大量的if else 而出现大量if的原因是new 也就是说new是造成耦合的关键
//        //什么框架可以解决？ spring
//        //为什么可以解决？ 底层的反射机制

 //   }

    //反射第二种方法作业
    public static Usb getInstance(String beanName) {
        Usb usb=null;
        try {
            usb = (Usb) Class.forName(beanName).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usb;
    }
}
