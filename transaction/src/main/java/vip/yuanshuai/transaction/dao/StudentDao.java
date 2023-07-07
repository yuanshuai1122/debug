package vip.yuanshuai.transaction.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import vip.yuanshuai.transaction.beans.Student;

/**
 * @program: debug
 * @description: 学生dao
 * @author: yuanshuai
 * @create: 2023-07-07 13:28
 **/
@Mapper
public interface StudentDao {


    /**
     * 插入学生表
     *
     * @param student 学生
     */
    @Insert("insert into student (name, home) values(#{name}, #{home})")
    void insert(Student student);
}
