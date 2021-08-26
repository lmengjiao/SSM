package spring15zuoye;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    public StudentDao studentDao;


    @Override
    public void add() {
        studentDao.add();
    }

    @Override
    public void delete() {
        studentDao.delete();
    }

    @Override
    public void update() {
        studentDao.update();
    }

    @Override
    public void selectAll() {
        studentDao.selectAll();
    }
}
