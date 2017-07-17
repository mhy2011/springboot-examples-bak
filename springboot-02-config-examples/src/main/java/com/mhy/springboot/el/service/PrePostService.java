package com.mhy.springboot.el.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author mahaiyuan
 * @ClassName: PrePostService
 * @date 2017-07-17 下午11:11
 */
@Service
public class PrePostService {

  @PostConstruct
  public void init() {
    System.out.println("execute init method after construct");
  }

  @PreDestroy
  public void destroy() {
    System.out.println("execute destroy method before destroy PrePostService");
  }


  public void sayHello(String username) {
    System.out.println("Hello " + username);
  }

  public void syaHi(String username) {
    System.out.println("Hi " + username);
  }

}
