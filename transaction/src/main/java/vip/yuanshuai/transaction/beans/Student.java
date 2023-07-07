package vip.yuanshuai.transaction.beans;

import lombok.Data;

/**
 * 学生
 *
 * @author yuanshuai
 * @program: debug
 * @description: 学生实体
 * @author: yuanshuai
 * @create: 2023-07-07 13:26
 * @date 2023/07/07
 */
@Data
public class Student {

    /**
     * ID
     */
    private Integer id;

    /**
     * 名字
     */
    private String name;

    /**
     * 家庭住址
     */
    private String home;

}
