package com.joe.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * <dl>
 * <dt>User</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2019</dd>
 * <dd>Company:</dd>
 * <dd>CreateDate: 2019/6/6</dd>
 * </dl>
 *
 * @author xby
 */
//@Configuration
//@PropertySource(value = "配置文件路径")
@ConfigurationProperties(prefix = "joe")
@Component
public class User {

    private String userName;

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}