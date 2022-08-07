package com.miles.module6.dto;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Wzq
 * @version : 1.0
 * @Project : HeiMa-Project1
 * @Package : com.miles.module5.dto
 * @ClassName : Video.java
 * @createTime : 2022/8/6 11:54
 * @Email : zqwang21@163.com
 * @Description :
 */
public class Video {
    private String bv;//视频编号
    private String title;
    private LocalDateTime publishTime;
    private String cover;//封面
    private String introduction;
    private List<String> tagList;
    private String tags;

    public void setTags(String tags) {
        this.tags = tags;
    }

    private List<Play> playList;
    private String type;//转载or原创
    private String category;//分区

    public Video() {
    }

    public Video(String bv, String title, LocalDateTime publishTime, String cover, String introduction, List<String> tagList, List<Play> playList, String type, String category) {
        this.bv = bv;
        this.title = title;
        this.publishTime = publishTime;
        this.cover = cover;
        this.introduction = introduction;
        this.tagList = tagList;
        this.playList = playList;
        this.type = type;
        this.category = category;
    }

    public String getBv() {
        return bv;
    }

    public void setBv(String bv) {
        this.bv = bv;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(LocalDateTime publishTime) {
        this.publishTime = publishTime;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public List<String> getTagList() {
        String tags=this.tags;
        if(tags == null){
            return List.of();
        }
        String[] s = tags.split("_");
        return List.of(s);
    }

    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }

    public List<Play> getPlayList() {
        return playList;
    }

    public void setPlayList(List<Play> playList) {
        this.playList = playList;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
