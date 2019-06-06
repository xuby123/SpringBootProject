package com.joe.controller;

import com.joe.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <dl>
 * <dt>DemoController</dt>
 * <dd>Description: controller demo</dd>
 * <dd>Copyright: Copyright (C) 2019</dd>
 * <dd>Company:</dd>
 * <dd>CreateDate: 2019/6/6</dd>
 * </dl>
 *
 * @author xby
 */
@RestController
@RequestMapping(value = "api/v1/")
public class DemoController {

   @Autowired
    User user;

    @GetMapping(value = "hello")
    public void hello(){
        System.out.println("userName:"+user.getUserName() +" password:"+ user.getPassword());
    }



}