package hzm.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiaohuang on 2017/12/24.
 * ----------------The heart withered--------
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
     String   index(){
         return  "hello  world";
     }
}
