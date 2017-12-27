package hzm.user.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by xiaohuang on 2017/12/21.
 * ----------------The heart withered--------
 */

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class UserConsumerApplication {

    public static void main(String[] args){
        SpringApplication.run(UserConsumerApplication.class, args);
    }
}
