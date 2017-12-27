package hzm.user.consumer.service;

import hzm.api.user.service.service.UserService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiaohuang on 2017/12/21.
 * ----------------The heart withered--------
 */

@FeignClient("user-service")
public interface ConsumerUserService extends UserService {

}
