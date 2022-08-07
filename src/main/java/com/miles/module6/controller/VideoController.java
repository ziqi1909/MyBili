package com.miles.module6.controller;


import com.miles.module6.dto.Play;
import com.miles.module6.dto.Video;
import com.miles.module6.service.VideoService1;
import com.miles.module6.service.VideoService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Wzq
 * @version : 1.0
 * @Project : HeiMa-Project1
 * @Package : com.miles.module5.controller
 * @ClassName : VideoController.java
 * @createTime : 2022/8/6 12:22
 * @Email : zqwang21@163.com
 * @Description :
 */
@Controller
public class VideoController {

    @RequestMapping("/video/{bv}")
    @ResponseBody
    public Video t(@PathVariable String bv) throws IOException {
        return videoService2.find(bv);
    }
    @Autowired
    private VideoService2 videoService2;
}

