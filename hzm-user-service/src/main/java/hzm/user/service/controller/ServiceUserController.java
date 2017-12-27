package hzm.user.service.controller;

import hzm.api.user.service.dto.User;
import hzm.api.user.service.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiaohuang on 2017/12/21.
 * ----------------The heart withered--------
 */

@RestController
public class ServiceUserController implements UserService {


    @Override
    public String hello(@RequestParam("name") String name) {
        return "hello"+name;
    }

    @Override
    public String hello(@RequestBody User user) {
        return "hello"+user.getName()+"  world";
    }
}
