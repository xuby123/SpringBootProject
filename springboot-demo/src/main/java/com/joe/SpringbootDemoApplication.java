package com.joe;

import com.joe.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *<p>功能描述: SpringBoot入口</p >
 *<ul>
 *<li>@param null </li>
 *<li>@return </li>
 *<li>@throws </li>
 *<li>@author xubiyu</li>
 *<li>@date 2019-06-05 21:46</li>
 *</ul>
*/
@SpringBootApplication
@EnableConfigurationProperties({User.class})
@EnableEurekaClient
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

}
