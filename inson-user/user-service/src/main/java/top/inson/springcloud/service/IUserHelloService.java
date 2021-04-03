package top.inson.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.inson.springcloud.service.hystric.UserHelloServiceHystric;

@FeignClient(value = "user-feign", fallback = UserHelloServiceHystric.class)
public interface IUserHelloService {

    @GetMapping("/sayHello")
    String sayHello(
            @RequestParam(required = false) String username);

}
