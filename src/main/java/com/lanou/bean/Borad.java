package com.lanou.bean;

/**
 * Created by dllo on 17/8/21.
 */
public class Borad {
    private Integer boradId;
    private String boradContent;
    private String boradTime;
    private String topCount;
    private String treadCount;

    @Override
    public String toString() {
        return "Borad{" +
                "boradId=" + boradId +
                ", boradContent='" + boradContent + '\'' +
                ", boradTime='" + boradTime + '\'' +
                ", topCount='" + topCount + '\'' +
                ", treadCount='" + treadCount + '\'' +
                '}';
    }

    public Integer getBoradId() {
        return boradId;
    }

    public void setBoradId(Integer boradId) {
        this.boradId = boradId;
    }

    public String getBoradContent() {
        return boradContent;
    }

    public void setBoradContent(String boradContent) {
        this.boradContent = boradContent;
    }

    public String getBoradTime() {
        return boradTime;
    }

    public void setBoradTime(String boradTime) {
        this.boradTime = boradTime;
    }

    public String getTopCount() {
        return topCount;
    }

    public void setTopCount(String topCount) {
        this.topCount = topCount;
    }

    public String getTreadCount() {
        return treadCount;
    }

    public void setTreadCount(String treadCount) {
        this.treadCount = treadCount;
    }
}
