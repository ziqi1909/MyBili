package com.miles.module6;

import com.miles.module6.dto.Play;
import com.miles.module6.mapper.PlayMapper;
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
 * @ClassName : TestPlayMapper.java
 * @createTime : 2022/8/7 13:23
 * @Email : zqwang21@163.com
 * @Description :
 */
@SpringBootTest
public class TestPlayMapper {
    @Autowired
    PlayMapper playMapper;
    @Test
    public void test(){
        List<Play> bv = playMapper.findByBv("1");
        System.out.println(bv.size());
    }
}
