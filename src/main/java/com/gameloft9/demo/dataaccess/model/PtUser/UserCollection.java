package com.gameloft9.demo.dataaccess.model.PtUser;

import lombok.ToString;

import javax.persistence.*;
@ToString
@Table(name = "t_collection")
public class UserCollection {
    /**
     * 收藏的帖子id 自增
     */
    @Id
    @Column(name = "collect_id")
    private String collectId;

    /**
     * 关联用户的外键
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 关联的帖子的id
     */
    @Column(name = "tip_id")
    private String tipId;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 获取收藏的帖子id 自增
     *
     * @return collect_id - 收藏的帖子id 自增
     */
    public String getCollectId() {
        return collectId;
    }

    /**
     * 设置收藏的帖子id 自增
     *
     * @param collectId 收藏的帖子id 自增
     */
    public void setCollectId(String collectId) {
        this.collectId = collectId;
    }

    /**
     * 获取关联用户的外键
     *
     * @return user_id - 关联用户的外键
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置关联用户的外键
     *
     * @param userId 关联用户的外键
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取关联的帖子的id
     *
     * @return tip_id - 关联的帖子的id
     */
    public String getTipId() {
        return tipId;
    }

    /**
     * 设置关联的帖子的id
     *
     * @param tipId 关联的帖子的id
     */
    public void setTipId(String tipId) {
        this.tipId = tipId;
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}