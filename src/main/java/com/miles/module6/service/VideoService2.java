package com.miles.module6.service;

import com.miles.module6.dto.Play;
import com.miles.module6.dto.Video;
import com.miles.module6.mapper.PlayMapper;
import com.miles.module6.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Wzq
 * @version : 1.0
 * @Project : HeiMa-Project1
 * @Package : com.miles.module6.service
 * @ClassName : VideoService2.java
 * @createTime : 2022/8/7 13:27
 * @Email : zqwang21@163.com
 * @Description :
 */
@Service
public class VideoService2 {
    @Autowired
    VideoMapper videoMapper;
    @Autowired
    PlayMapper playMapper;

    public Video find(String bv){
        Video video = videoMapper.findById(bv);
        if(video==null){
            return null;
        }
        List<Play> playList = playMapper.findByBv(bv);
        video.setPlayList(playList);
        return video;
    }
}
