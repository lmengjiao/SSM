package spring15zuoye;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
    public void add(){
        System.out.println("我是增加");
    }

    public void delete(){
        System.out.println("我是删除");
    }

    public void update(){
        System.out.println("我是查询");
    }

    public void selectAll(){
        System.out.println("我是查询");
    }
}
