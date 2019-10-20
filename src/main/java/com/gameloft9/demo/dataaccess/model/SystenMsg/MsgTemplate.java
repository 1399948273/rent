package com.gameloft9.demo.dataaccess.model.SystenMsg;

import javax.persistence.*;

@Table(name = "sys_msg_template")
public class MsgTemplate {
    /**
     * 消息模版自增id
     */
    @Id
    private Integer id;

    /**
     * 模版类型（引导语模版，警告模版等）
     */
    private String type;

    /**
     * 模版内容
     */
    private String text;

    /**
     * 模版名称
     */
    private String name;

    /**
     * 获取消息模版自增id
     *
     * @return id - 消息模版自增id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置消息模版自增id
     *
     * @param id 消息模版自增id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取模版类型（引导语模版，警告模版等）
     *
     * @return type - 模版类型（引导语模版，警告模版等）
     */
    public String getType() {
        return type;
    }

    /**
     * 设置模版类型（引导语模版，警告模版等）
     *
     * @param type 模版类型（引导语模版，警告模版等）
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取模版内容
     *
     * @return text - 模版内容
     */
    public String getText() {
        return text;
    }

    /**
     * 设置模版内容
     *
     * @param text 模版内容
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 获取模版名称
     *
     * @return name - 模版名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置模版名称
     *
     * @param name 模版名称
     */
    public void setName(String name) {
        this.name = name;
    }
}