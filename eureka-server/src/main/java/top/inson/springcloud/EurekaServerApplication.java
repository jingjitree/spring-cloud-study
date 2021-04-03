package top.inson.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekeServerApplication
 * @Description
 * @Author jingjitree
 * @Date 2021/4/3 18:03
 * @Version 1.0
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {


    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
