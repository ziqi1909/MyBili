package com.miles.module6.service;

import com.miles.module6.dto.Play;
import com.miles.module6.dto.Video;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Wzq
 * @version : 1.0
 * @Project : HeiMa-Project1
 * @Package : com.miles.module6.service
 * @ClassName : VideoService.java
 * @createTime : 2022/8/6 13:52
 * @Email : zqwang21@163.com
 * @Description :
 */
@Service
public class VideoService1 {
    @PostConstruct
    public void init(){
        try {
            List<String> data = Files.readAllLines(Path.of("data", "p.csv"));
            for (String line : data) {
                String[] s = line.split(",");
                    String[] tags = s[7].split("_");
                    List<Play> list = getPlayList(s[0]);
                    Video video =new Video(s[0], s[3], LocalDateTime.parse(s[6]), s[4], s[5], Arrays.asList(tags), list, s[1], s[2]);
                    map.put(s[0],video);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    Map<String,Video> map = new HashMap<>();
    //查询：根据视频编号，查询Video对象
    public Video find(String bv){
        Video video=map.get(bv);
        return video;
    }
    //读取选集文件
    private List<Play> getPlayList(String bv) {
        try {
            List<String> vdata = Files.readAllLines(Path.of("data", "v_" + bv + ".csv"));
            List<Play> list = new ArrayList<>();

            for (String vline : vdata) {
                String[] ss = vline.split(",");
                list.add(new Play(ss[0],ss[1], LocalTime.parse(ss[3]),ss[2]));
            }
            return list;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
