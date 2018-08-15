package com.zhangtao.spring_cloud_service.XiaoheiSpringCloudService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@ImportResource(locations={"classpath:application.yml"})
@EnableEurekaServer
@SpringBootApplication
public class App 
{
	@Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
	
    public static void main(String[] args )
    {
    	SpringApplication.run(App.class, args);
       
    }
}
