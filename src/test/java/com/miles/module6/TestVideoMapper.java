package com.miles.module6;

import com.miles.module6.dto.Video;
import com.miles.module6.mapper.VideoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Wzq
 * @version : 1.0
 * @Project : HeiMa-Project1
 * @Package : com.miles.module6
 * @ClassName : TestVideoMapper.java
 * @createTime : 2022/8/7 12:43
 * @Email : zqwang21@163.com
 * @Description :
 */
@SpringBootTest
public class TestVideoMapper {
    @Autowired
    VideoMapper videoMapper;
    @Test
    public void test(){
        Video v = videoMapper.findById("2");
        System.out.println(v.getBv());
        System.out.println(v.getCategory());
        System.out.println(v.getPublishTime());
        System.out.println(v.getTagList());


    }
}
