package com.gameloft9.demo.dataaccess.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_oper_record")
public class OperRecord {
    /**
     * 日志id
     */
    @Id
    private String id;

    /**
     * 操作人id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 操作人昵称
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 操作类型
     */
    private String type;

    /**
     * 操作时间
     */
    private Date time;

    /**
     * 操作的对象id
     */
    @Column(name = "oper_id")
    private String operId;

    /**
     * 操作的对象的名称
     */
    @Column(name = "oper_name")
    private String operName;

    /**
     * 获取日志id
     *
     * @return id - 日志id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置日志id
     *
     * @param id 日志id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取操作人id
     *
     * @return user_id - 操作人id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置操作人id
     *
     * @param userId 操作人id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取操作人昵称
     *
     * @return user_name - 操作人昵称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置操作人昵称
     *
     * @param userName 操作人昵称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取操作类型
     *
     * @return type - 操作类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置操作类型
     *
     * @param type 操作类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取操作时间
     *
     * @return time - 操作时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置操作时间
     *
     * @param time 操作时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取操作的对象id
     *
     * @return oper_id - 操作的对象id
     */
    public String getOperId() {
        return operId;
    }

    /**
     * 设置操作的对象id
     *
     * @param operId 操作的对象id
     */
    public void setOperId(String operId) {
        this.operId = operId;
    }

    /**
     * 获取操作的对象的名称
     *
     * @return oper_name - 操作的对象的名称
     */
    public String getOperName() {
        return operName;
    }

    /**
     * 设置操作的对象的名称
     *
     * @param operName 操作的对象的名称
     */
    public void setOperName(String operName) {
        this.operName = operName;
    }
}