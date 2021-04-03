package top.inson.springcloud.service.hystric;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import top.inson.springcloud.service.IUserHelloService;

/**
 * @ClassName UserHelloServiceHystric
 * @Description
 * @Author jingjitree
 * @Date 2021/4/3 19:31
 * @Version 1.0
 **/
@Slf4j
@Component
public class UserHelloServiceHystric implements IUserHelloService {

    @Override
    public String sayHello(String username) {
        log.info("消费者调用服务失败了：" + username);
        return "sorry，请求失败" + username;
    }

}
