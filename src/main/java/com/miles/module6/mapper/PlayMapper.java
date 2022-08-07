package com.miles.module6.mapper;

import com.miles.module6.dto.Play;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Wzq
 * @version : 1.0
 * @Project : HeiMa-Project1
 * @Package : com.miles.module6.mapper
 * @ClassName : PlayMapper.java
 * @createTime : 2022/8/7 12:24
 * @Email : zqwang21@163.com
 * @Description :
 */
@Mapper
public interface PlayMapper {

    @Select("""
            select id, title, url, duration
            from play where bv = #{bv}
            """)
    List<Play> findByBv(String bv);
}
