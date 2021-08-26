package spring15zuoye;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Test01 {
    @Test
   public void test01(){
        String xml="spring15zuoye/applicationContext.xml";
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(xml);
//        StudentController s = ac.getBean("studentController", StudentController.class);
//        s.add();
//        s.delete();
//        s.update();
//        s.selectAll();

        ComboPooledDataSource dataSource = ac.getBean("dataSource", ComboPooledDataSource.class);
        System.out.println("dataSource = " + dataSource);
        try {
            System.out.println("dataSource.getConnection() = " + dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
