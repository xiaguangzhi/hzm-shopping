package hzm.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by xiaohuang on 2017/12/27.
 * ----------------The heart withered--------
 */
@EnableZuulProxy
@SpringCloudApplication
public class GateWayApplication {
    public static void main(String[] args){
        SpringApplication.run(GateWayApplication.class,args);
    }
}
