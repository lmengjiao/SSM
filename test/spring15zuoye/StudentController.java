package spring15zuoye;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {
    @Autowired
    public StudentService studentService;

    public void add(){
        studentService.add();
    }

    public void delete(){
        studentService.delete();
    }

    public void update(){
        studentService.update();
    }

    public void selectAll(){
        studentService.selectAll();
    }
}
