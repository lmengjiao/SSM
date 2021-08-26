package spring13zhujiedi;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class AdminController {
    @Resource
    private AdminService adminService;

    //查询全部
    public void selectAll(){
        //controller调用service 所以controller依赖service
        adminService.selectAll();
    }
}
