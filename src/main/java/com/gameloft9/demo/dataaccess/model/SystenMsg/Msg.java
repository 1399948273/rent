package com.gameloft9.demo.dataaccess.model.SystenMsg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_msg")
public class Msg {
    /**
     * 系统消息自增id
     */
    @Id
    private Integer id;

    /**
     * 消息类型(警告，欢迎等)
     */
    private String type;

    /**
     * 消息内容
     */
    private String text;

    /**
     * 发送给的用户id,0则代表所有用户
     */
    @Column(name = "send_id")
    private String sendId;

    /**
     * 接收者id
     */
    @Column(name = "rec_id")
    private String recId;

    /**
     * 是否删除
     */
    @Column(name = "is_del")
    private Boolean isDel;

    /**
     * 发布时间
     */
    private Date time;

    /**
     * 已读状态，0为未读1为已读
     */
    @Column(name = "read_status")
    private Boolean readStatus;

    /**
     * 获取系统消息自增id
     *
     * @return id - 系统消息自增id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置系统消息自增id
     *
     * @param id 系统消息自增id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取消息类型(警告，欢迎等)
     *
     * @return type - 消息类型(警告，欢迎等)
     */
    public String getType() {
        return type;
    }

    /**
     * 设置消息类型(警告，欢迎等)
     *
     * @param type 消息类型(警告，欢迎等)
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取消息内容
     *
     * @return text - 消息内容
     */
    public String getText() {
        return text;
    }

    /**
     * 设置消息内容
     *
     * @param text 消息内容
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 获取发送给的用户id,0则代表所有用户
     *
     * @return send_id - 发送给的用户id,0则代表所有用户
     */
    public String getSendId() {
        return sendId;
    }

    /**
     * 设置发送给的用户id,0则代表所有用户
     *
     * @param sendId 发送给的用户id,0则代表所有用户
     */
    public void setSendId(String sendId) {
        this.sendId = sendId;
    }

    /**
     * 获取接收者id
     *
     * @return rec_id - 接收者id
     */
    public String getRecId() {
        return recId;
    }

    /**
     * 设置接收者id
     *
     * @param recId 接收者id
     */
    public void setRecId(String recId) {
        this.recId = recId;
    }

    /**
     * 获取是否删除
     *
     * @return is_del - 是否删除
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * 设置是否删除
     *
     * @param isDel 是否删除
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    /**
     * 获取发布时间
     *
     * @return time - 发布时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置发布时间
     *
     * @param time 发布时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取已读状态，0为未读1为已读
     *
     * @return read_status - 已读状态，0为未读1为已读
     */
    public Boolean getReadStatus() {
        return readStatus;
    }

    /**
     * 设置已读状态，0为未读1为已读
     *
     * @param readStatus 已读状态，0为未读1为已读
     */
    public void setReadStatus(Boolean readStatus) {
        this.readStatus = readStatus;
    }
}