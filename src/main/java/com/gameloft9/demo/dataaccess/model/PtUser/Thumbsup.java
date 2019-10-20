package com.gameloft9.demo.dataaccess.model.PtUser;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_thumbsup")
public class Thumbsup {
    /**
     * 点赞id自增主键
     */
    @Id
    private String id;

    /**
     * 点赞人id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 点赞时间
     */
    private Date time;

    /**
     * 是否删除
     */
    @Column(name = "is_del")
    private Boolean isDel;

    /**
     * 被点赞人id
     */
    @Column(name = "be_user_id")
    private String beUserId;

    /**
     * 获取点赞id自增主键
     *
     * @return id - 点赞id自增主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置点赞id自增主键
     *
     * @param id 点赞id自增主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取点赞人id
     *
     * @return user_id - 点赞人id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置点赞人id
     *
     * @param userId 点赞人id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取点赞时间
     *
     * @return time - 点赞时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置点赞时间
     *
     * @param time 点赞时间
     */
    public void setTime(Date time) {
        this.time = time;
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
     * 获取被点赞人id
     *
     * @return be_user_id - 被点赞人id
     */
    public String getBeUserId() {
        return beUserId;
    }

    /**
     * 设置被点赞人id
     *
     * @param beUserId 被点赞人id
     */
    public void setBeUserId(String beUserId) {
        this.beUserId = beUserId;
    }
}