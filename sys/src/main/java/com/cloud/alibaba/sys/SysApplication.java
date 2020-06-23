package com.cloud.alibaba.sys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
public class SysApplication {

  public static void main(String[] args) {
    SpringApplication.run(SysApplication.class, args);
  }

  @RestController
  public class EchoController {
    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
      return "Hello Nacos Discovery " + string;
    }
  }
}
