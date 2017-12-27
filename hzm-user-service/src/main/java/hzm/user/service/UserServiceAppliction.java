package hzm.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by xiaohuang on 2017/12/21.
 * ----------------The heart withered--------
 */

@EnableDiscoveryClient
@SpringBootApplication
public class UserServiceAppliction {

    public static void main(String[] args){
        SpringApplication.run(UserServiceAppliction.class, args);
    }

}
