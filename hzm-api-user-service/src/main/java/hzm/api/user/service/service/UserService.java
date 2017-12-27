package hzm.api.user.service.service;

import hzm.api.user.service.dto.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by xiaohuang on 2017/12/21.
 * ----------------The heart withered--------
 */

@RequestMapping("user")
public interface UserService {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String  hello(@RequestParam("name") String name);
    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    String  hello(@RequestBody User user);

}
