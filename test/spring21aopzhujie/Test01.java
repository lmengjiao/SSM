package spring21aopzhujie;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //使用junit
@ContextConfiguration(locations = "classpath:spring21aopzhujie/applicationContext.xml")
public class Test01 {
    @Autowired
    private AccountService accountService;
    @Test
    public void test01(){
        accountService.findAll();
    }
}
