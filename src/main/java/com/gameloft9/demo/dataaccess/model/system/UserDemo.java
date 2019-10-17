package com.gameloft9.demo.dataaccess.model.system;

import lombok.Data;

import java.io.Serializable;

/*
 * @author: 帅气的达
 * @date:   创建时间：2019/10/17 15:32
 * @Email:  867256260@qq.com
 * @description:
 */
@Data
public class UserDemo implements Serializable {

    private int id;

    private String username;

    private String sex;

    private int age;

}
