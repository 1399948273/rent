package com.gameloft9.demo.dataaccess.model.PtUser;

import javax.persistence.*;

@Table(name = "t_user_concern")
public class UserConcern {
    /**
     * 关注id
     */
    @Id
    private String id;

    /**
     * 关注人的id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 被关注的人的id
     */
    @Column(name = "be_user_id")
    private String beUserId;

    /**
     * 是否删除
     */
    @Column(name = "is_del")
    private Boolean isDel;

    /**
     * 获取关注id
     *
     * @return id - 关注id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置关注id
     *
     * @param id 关注id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取关注人的id
     *
     * @return user_id - 关注人的id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置关注人的id
     *
     * @param userId 关注人的id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取被关注的人的id
     *
     * @return be_user_id - 被关注的人的id
     */
    public String getBeUserId() {
        return beUserId;
    }

    /**
     * 设置被关注的人的id
     *
     * @param beUserId 被关注的人的id
     */
    public void setBeUserId(String beUserId) {
        this.beUserId = beUserId;
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
}