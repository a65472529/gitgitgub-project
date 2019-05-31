package com.unicom.gitgithub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;



//SpringBoot有自动装配的功能,所以现在排除数据库的自动装配
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class GitgithubApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(GitgithubApplication.class, args);
    }

}
//alt+ctrl+shift+a+/,选择注册

