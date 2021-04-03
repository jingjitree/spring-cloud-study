package top.inson.springcloud.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigTestController
 * @Description
 * @Author jingjitree
 * @Date 2021/4/3 22:09
 * @Version 1.0
 **/
@RestController
public class ConfigTestController {
    @Value("${foo}")
    private String foo;

    @GetMapping("foo")
    public String foo(){
        return foo;
    }

}
