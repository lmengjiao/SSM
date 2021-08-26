package spring11duquproperties;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Test01 {
    @Test
    public void test01(){
        String xml="spring11duquproperties/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        ComboPooledDataSource dataSource = ac.getBean("dataSource", ComboPooledDataSource.class);
        System.out.println("dataSource = " + dataSource);
        try {
            System.out.println("dataSource.getConnection() = " + dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void test02(){
        String xml="spring11duquproperties/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        ComboPooledDataSource dataSource1 = ac.getBean("dataSource1", ComboPooledDataSource.class);
        System.out.println("dataSource1 = " + dataSource1);
        try {
            System.out.println("dataSource1.getConnection() = " + dataSource1.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //第三种 读取多个 属性为string
//    @Test
//    public void test03(){
//        String xml="spring11duquproperties/applicationContext.xml";
//        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
//        ComboPooledDataSource dataSource1 = ac.getBean("readPropertiesBean", ComboPooledDataSource.class);
//        System.out.println("dataSource1 = " + dataSource1);
//        try {
//            System.out.println("dataSource1.getConnection() = " + dataSource1.getConnection());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
    }
    

