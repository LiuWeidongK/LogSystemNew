package com.wangdian.manage.entity;

/**
 * @author : LiuWeidong
 * @date : 2018/9/21.
 */
public class ActiveMQInfo {

    private String mqLogQueue;
    private String mqEmailQueue;
    private String mqQqQueue;
    private String logBase;
    private String noticeQq;
    private String noticeEmail;

    public String getMqLogQueue() {
        return mqLogQueue;
    }

    public void setMqLogQueue(String mqLogQueue) {
        this.mqLogQueue = mqLogQueue;
    }

    public String getMqEmailQueue() {
        return mqEmailQueue;
    }

    public void setMqEmailQueue(String mqEmailQueue) {
        this.mqEmailQueue = mqEmailQueue;
    }

    public String getMqQqQueue() {
        return mqQqQueue;
    }

    public void setMqQqQueue(String mqQqQueue) {
        this.mqQqQueue = mqQqQueue;
    }

    public String getLogBase() {
        return logBase;
    }

    public void setLogBase(String logBase) {
        this.logBase = logBase;
    }

    public String getNoticeQq() {
        return noticeQq;
    }

    public void setNoticeQq(String noticeQq) {
        this.noticeQq = noticeQq;
    }

    public String getNoticeEmail() {
        return noticeEmail;
    }

    public void setNoticeEmail(String noticeEmail) {
        this.noticeEmail = noticeEmail;
    }

    @Override
    public String toString() {
        return "ActiveMQInfo{" +
                "mqLogQueue='" + mqLogQueue + '\'' +
                ", mqEmailQueue='" + mqEmailQueue + '\'' +
                ", mqQqQueue='" + mqQqQueue + '\'' +
                ", logBase='" + logBase + '\'' +
                ", noticeQq='" + noticeQq + '\'' +
                ", noticeEmail='" + noticeEmail + '\'' +
                '}';
    }
}
