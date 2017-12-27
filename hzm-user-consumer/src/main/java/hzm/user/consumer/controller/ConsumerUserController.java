package hzm.user.consumer.controller;

import hzm.user.consumer.service.ConsumerUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiaohuang on 2017/12/21.
 * ----------------The heart withered--------
 */

@RestController
public class ConsumerUserController {
    @Autowired
    private ConsumerUserService consumerUserService;
   @RequestMapping("/feign-consumer")
    public   String   helloConsumer(){
        String name ="xiaohuang";
        return   consumerUserService.hello(name);
    }
}
