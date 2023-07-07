package vip.yuanshuai.transaction.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vip.yuanshuai.transaction.beans.Student;
import vip.yuanshuai.transaction.dao.StudentDao;

/**
 * @program: debug
 * @description: 事务服务
 * @author: yuanshuai
 * @create: 2023-07-07 13:24
 **/
@Service
public class TransactionService {

    private final StudentDao studentDao;

    public TransactionService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }


    @Transactional(rollbackFor = Exception.class, noRollbackFor = RuntimeException.class)
    public void insertTestNoRollbackFor() {
        Student student = new Student();
        student.setName("小明");
        student.setHome("幸福大街20099");
        studentDao.insert(student);
        throw new RuntimeException();

    }

    @Transactional(rollbackFor = RuntimeException.class, noRollbackFor = Exception.class)
    public void insertTestRollback() {
        Student student = new Student();
        student.setName("小明");
        student.setHome("幸福大街20099");
        studentDao.insert(student);
        throw new RuntimeException();

    }


    @Transactional(rollbackFor = RuntimeException.class, noRollbackFor = Exception.class)
    public void insertTest() {
        Student student = new Student();
        student.setName("小明");
        student.setHome("幸福大街20099");
        studentDao.insert(student);
        throw new NullPointerException();

    }

}
