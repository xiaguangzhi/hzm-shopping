# 服务注册中心
##  添加依赖包
```
        <!--服务注册中心-->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-eureka-server</artifactId>
        </dependency>
```

##  添加注解
  ```
  @EnableEurekaServer
  @SpringBootApplication
  public class Applicatoon {
      public static void main(String[] args){
          SpringApplication.run(Applicatoon.class,args);
      }
  }
  ```

## 增加配置

