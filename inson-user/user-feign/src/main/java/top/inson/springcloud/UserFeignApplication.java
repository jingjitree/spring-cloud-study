package top.inson.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName UserFeignApplication
 * @Description
 * @Author jingjitree
 * @Date 2021/4/3 18:35
 * @Version 1.0
 **/
@EnableEurekaClient
@SpringBootApplication
public class UserFeignApplication {


    public static void main(String[] args) {
        SpringApplication.run(UserFeignApplication.class, args);
    }

}
