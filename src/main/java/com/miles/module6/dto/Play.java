package com.miles.module6.dto;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Wzq
 * @version : 1.0
 * @Project : HeiMa-Project1
 * @Package : com.miles.module5.dto
 * @ClassName : Play.java
 * @createTime : 2022/8/6 11:55
 * @Email : zqwang21@163.com
 * @Description :
 */
public class Play {
    private String id;//视频编号
    private String title;
    private LocalTime duration;
    private String url;

    public Play() {
    }

    public Play(String id, String title, LocalTime duration, String url) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
