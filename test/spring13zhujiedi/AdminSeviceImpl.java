package spring13zhujiedi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminSeviceImpl implements AdminService{
    //@Resource //相当于xml中的注入 注解1 tomcat提供 byName
    @Autowired //注解2 spring提供 更多使用这个  byType
    private AdminDao adminDao;

    @Override
    public void selectAll() {
        //service调用dao 所以service依赖dao
        adminDao.selectAll();
    }
}
