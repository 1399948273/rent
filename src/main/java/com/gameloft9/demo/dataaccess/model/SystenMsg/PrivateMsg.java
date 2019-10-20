package com.gameloft9.demo.dataaccess.model.SystenMsg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_private_msg")
public class PrivateMsg {
    /**
     * 私信id
     */
    @Id
    private String id;

    /**
     * 私信人id，接收私信的人的id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 发送人id，发送私信的人的id
     */
    @Column(name = "send_id")
    private String sendId;

    /**
     * 发送人昵称
     */
    @Column(name = "send_name")
    private String sendName;

    /**
     * 发送时间
     */
    @Column(name = "send_time")
    private Date sendTime;

    /**
     * 发送内容
     */
    @Column(name = "send_text")
    private String sendText;

    /**
     * 已读状态，1为已读，0为未读
     */
    @Column(name = "read_status")
    private Boolean readStatus;

    /**
     * 1：文件或者0：文字
     */
    private Boolean type;

    /**
     * 获取私信id
     *
     * @return id - 私信id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置私信id
     *
     * @param id 私信id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取私信人id，接收私信的人的id
     *
     * @return user_id - 私信人id，接收私信的人的id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置私信人id，接收私信的人的id
     *
     * @param userId 私信人id，接收私信的人的id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取发送人id，发送私信的人的id
     *
     * @return send_id - 发送人id，发送私信的人的id
     */
    public String getSendId() {
        return sendId;
    }

    /**
     * 设置发送人id，发送私信的人的id
     *
     * @param sendId 发送人id，发送私信的人的id
     */
    public void setSendId(String sendId) {
        this.sendId = sendId;
    }

    /**
     * 获取发送人昵称
     *
     * @return send_name - 发送人昵称
     */
    public String getSendName() {
        return sendName;
    }

    /**
     * 设置发送人昵称
     *
     * @param sendName 发送人昵称
     */
    public void setSendName(String sendName) {
        this.sendName = sendName;
    }

    /**
     * 获取发送时间
     *
     * @return send_time - 发送时间
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * 设置发送时间
     *
     * @param sendTime 发送时间
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * 获取发送内容
     *
     * @return send_text - 发送内容
     */
    public String getSendText() {
        return sendText;
    }

    /**
     * 设置发送内容
     *
     * @param sendText 发送内容
     */
    public void setSendText(String sendText) {
        this.sendText = sendText;
    }

    /**
     * 获取已读状态，1为已读，0为未读
     *
     * @return read_status - 已读状态，1为已读，0为未读
     */
    public Boolean getReadStatus() {
        return readStatus;
    }

    /**
     * 设置已读状态，1为已读，0为未读
     *
     * @param readStatus 已读状态，1为已读，0为未读
     */
    public void setReadStatus(Boolean readStatus) {
        this.readStatus = readStatus;
    }

    /**
     * 获取1：文件或者0：文字
     *
     * @return type - 1：文件或者0：文字
     */
    public Boolean getType() {
        return type;
    }

    /**
     * 设置1：文件或者0：文字
     *
     * @param type 1：文件或者0：文字
     */
    public void setType(Boolean type) {
        this.type = type;
    }
}