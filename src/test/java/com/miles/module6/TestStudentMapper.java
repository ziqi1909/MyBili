package com.miles.module6;

import com.miles.module6.dto.Student;
import com.miles.module6.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Wzq
 * @version : 1.0
 * @Project : HeiMa-Project1
 * @Package : com.miles.module6
 * @ClassName : TestStudentMapper.java
 * @createTime : 2022/8/7 11:17
 * @Email : zqwang21@163.com
 * @Description :
 */
//单元测试
@SpringBootTest
public class TestStudentMapper {
    @Autowired
    StudentMapper studentMapper;

    @Test
    public void test() {
        List<Student> all = studentMapper.findAll();
        for (Student student : all) {
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
    }

    @Test
    public void test1() {
        Student s = studentMapper.findById(3);
        System.out.println(s.getName());
    }

    @Test
    public void test2() {
        Student stu = new Student(8, "牛九");
        studentMapper.insert(stu);
        List<Student> all = studentMapper.findAll();
        for (Student student : all) {
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
    }

    @Test
    public void test3() {
        Student stu = new Student(1, "张小三");
        studentMapper.update(stu);
        List<Student> all = studentMapper.findAll();
        for (Student student : all) {
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
    }

    @Test
    public void test4() {
        studentMapper.delete(7);
        List<Student> all = studentMapper.findAll();
        for (Student student : all) {
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
    }
}
