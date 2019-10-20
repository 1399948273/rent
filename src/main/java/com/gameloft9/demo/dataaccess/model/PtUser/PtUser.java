package com.gameloft9.demo.dataaccess.model.PtUser;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user")
public class PtUser {
    /**
     * 用户的ID
     */
    @Id
    @Column(name = "user_id")
    private String userId;

    /**
     * 用户昵称
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 第三方的unique，id

     */
    @Column(name = "unique_id")
    private String uniqueId;

    /**
     * 性别
     */
    private String sex;

    /**
     * 用户头像
     */
    @Column(name = "head_img")
    private String headImg;

    /**
     * 用户最后一次登录时间
     */
    @Column(name = "last_login")
    private Date lastLogin;

    /**
     * 是否冻结(0正常，1冻结)
     */
    @Column(name = "is_del")
    private Boolean isDel;

    /**
     * 是否可发布帖子(0正常，1冻结)
     */
    @Column(name = "is_publish")
    private Boolean isPublish;

    /**
     * 能否评论(0正常，1冻结)
     */
    @Column(name = "is_comment")
    private Boolean isComment;

    /**
     * 能否私信(0正常，1冻结)
     */
    @Column(name = "is_msg")
    private Boolean isMsg;

    /**
     * 能否点赞(0正常，1冻结)
     */
    @Column(name = "is_like")
    private Boolean isLike;

    /**
     * 虚拟关注数
     */
    @Column(name = "artificial_num")
    private Integer artificialNum;

    /**
     * 虚拟点赞数
     */
    @Column(name = "thumbsup_num")
    private Integer thumbsupNum;

    /**
     * 获取用户的ID
     *
     * @return user_id - 用户的ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户的ID
     *
     * @param userId 用户的ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取用户昵称
     *
     * @return user_name - 用户昵称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户昵称
     *
     * @param userName 用户昵称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取第三方的unique，id

     *
     * @return unique_id - 第三方的unique，id

     */
    public String getUniqueId() {
        return uniqueId;
    }

    /**
     * 设置第三方的unique，id

     *
     * @param uniqueId 第三方的unique，id

     */
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取用户头像
     *
     * @return head_img - 用户头像
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * 设置用户头像
     *
     * @param headImg 用户头像
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    /**
     * 获取用户最后一次登录时间
     *
     * @return last_login - 用户最后一次登录时间
     */
    public Date getLastLogin() {
        return lastLogin;
    }

    /**
     * 设置用户最后一次登录时间
     *
     * @param lastLogin 用户最后一次登录时间
     */
    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     * 获取是否冻结(0正常，1冻结)
     *
     * @return is_del - 是否冻结(0正常，1冻结)
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * 设置是否冻结(0正常，1冻结)
     *
     * @param isDel 是否冻结(0正常，1冻结)
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    /**
     * 获取是否可发布帖子(0正常，1冻结)
     *
     * @return is_publish - 是否可发布帖子(0正常，1冻结)
     */
    public Boolean getIsPublish() {
        return isPublish;
    }

    /**
     * 设置是否可发布帖子(0正常，1冻结)
     *
     * @param isPublish 是否可发布帖子(0正常，1冻结)
     */
    public void setIsPublish(Boolean isPublish) {
        this.isPublish = isPublish;
    }

    /**
     * 获取能否评论(0正常，1冻结)
     *
     * @return is_comment - 能否评论(0正常，1冻结)
     */
    public Boolean getIsComment() {
        return isComment;
    }

    /**
     * 设置能否评论(0正常，1冻结)
     *
     * @param isComment 能否评论(0正常，1冻结)
     */
    public void setIsComment(Boolean isComment) {
        this.isComment = isComment;
    }

    /**
     * 获取能否私信(0正常，1冻结)
     *
     * @return is_msg - 能否私信(0正常，1冻结)
     */
    public Boolean getIsMsg() {
        return isMsg;
    }

    /**
     * 设置能否私信(0正常，1冻结)
     *
     * @param isMsg 能否私信(0正常，1冻结)
     */
    public void setIsMsg(Boolean isMsg) {
        this.isMsg = isMsg;
    }

    /**
     * 获取能否点赞(0正常，1冻结)
     *
     * @return is_like - 能否点赞(0正常，1冻结)
     */
    public Boolean getIsLike() {
        return isLike;
    }

    /**
     * 设置能否点赞(0正常，1冻结)
     *
     * @param isLike 能否点赞(0正常，1冻结)
     */
    public void setIsLike(Boolean isLike) {
        this.isLike = isLike;
    }

    /**
     * 获取虚拟关注数
     *
     * @return artificial_num - 虚拟关注数
     */
    public Integer getArtificialNum() {
        return artificialNum;
    }

    /**
     * 设置虚拟关注数
     *
     * @param artificialNum 虚拟关注数
     */
    public void setArtificialNum(Integer artificialNum) {
        this.artificialNum = artificialNum;
    }

    /**
     * 获取虚拟点赞数
     *
     * @return thumbsup_num - 虚拟点赞数
     */
    public Integer getThumbsupNum() {
        return thumbsupNum;
    }

    /**
     * 设置虚拟点赞数
     *
     * @param thumbsupNum 虚拟点赞数
     */
    public void setThumbsupNum(Integer thumbsupNum) {
        this.thumbsupNum = thumbsupNum;
    }
}