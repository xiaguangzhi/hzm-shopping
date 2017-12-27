package hzm.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by xiaohuang on 2017/12/27.
 * ----------------The heart withered--------
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigApplication {
  public static void main(String[] args){
      SpringApplication.run(ConfigApplication.class,args);

  }
}
