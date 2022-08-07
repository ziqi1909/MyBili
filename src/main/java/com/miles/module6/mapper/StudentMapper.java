package com.miles.module6.mapper;

import com.miles.module6.dto.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Wzq
 * @version : 1.0
 * @Project : HeiMa-Project1
 * @Package : com.miles.module6.mapper
 * @ClassName : StudentMapper.java
 * @createTime : 2022/8/7 11:08
 * @Email : zqwang21@163.com
 * @Description :
 */
@Mapper //专用于增删改查的接口
//实现类由mybatis和spring实现，可以通过spring的依赖注入获取实现类对象
public interface StudentMapper {
    @Select("""
            select id, name
            from student
            """)
    List<Student> findAll();

    //根据编号查询学生
    @Select("""
            select id, name
            from student 
            where id=#{id}
            """)
    Student findById(int id);
    //新增学生
   /* @Insert("""
            insert into student(id,name)
            values(#{id},#{name})
            """)
    //多个参数时，要用@Param()告诉参数之间的对应关系
    void insert(@Param("id") int id,@Param("name") String name);*/
    @Insert("""
            insert into student(id,name)
            values(#{id},#{name})
            """)
        //尽量用一个参数
    void insert(Student stu);
    //修改学生
    @Update("""
            update student set name = #{name} where id =#{id}
            """)
    void update(Student stu);
    //删除学生
    @Delete("""
            delete from student where id = #{id}
            """)
    void delete(int id);
}
