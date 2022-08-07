package com.miles.module6.mapper;

import com.miles.module6.dto.Video;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Wzq
 * @version : 1.0
 * @Project : HeiMa-Project1
 * @Package : com.miles.module6.mapper
 * @ClassName : VideoMapper.java
 * @createTime : 2022/8/7 12:24
 * @Email : zqwang21@163.com
 * @Description :
 */
@Mapper
public interface VideoMapper {
    @Select("""
            select bv,
                   type,
                   category,
                   title,
                   cover,
                   introduction,
                   publish_time,
                   tags     
            from video
            where bv = #{bv}
            """)
    Video findById(String bv);
}
