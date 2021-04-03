package top.inson.springcloud.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description
 * @Author jingjitree
 * @Date 2021/4/3 18:37
 * @Version 1.0
 **/
@Slf4j
@RestController
public class HelloController {

    @GetMapping("/sayHello")
    public String sayHello(
            @RequestParam(required = false) String username){
        log.info("服务提供者被调用了：" + username);
        return "您好，世界world！" + username;
    }

}
