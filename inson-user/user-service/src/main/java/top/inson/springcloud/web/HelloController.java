package top.inson.springcloud.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.inson.springcloud.service.IUserHelloService;

/**
 * @ClassName HelloController
 * @Description
 * @Author jingjitree
 * @Date 2021/4/3 19:05
 * @Version 1.0
 **/
@Slf4j
@RestController
public class HelloController {
    @Autowired
    private IUserHelloService userHelloService;


    @GetMapping("/hello")
    public String hello(
            @RequestParam(required = false) String username){
        log.info("消费者被调用了：" + username);
        return userHelloService.sayHello(username);
    }

}
