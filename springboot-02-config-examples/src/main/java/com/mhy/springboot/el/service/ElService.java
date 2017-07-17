package com.mhy.springboot.el.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import lombok.Data;

/**
 * @author mahaiyuan
 * @ClassName: ElService
 * @date 2017-07-12 下午11:30
 */
@Service
@Data
@PropertySource("classpath:test.properties")  //资源文件
public class ElService {

  @Value("张三")  //注入普通字符串
  private String username;
  @Value("#{systemProperties['os.name']}")  //注入系统属性
  private String osName;
  @Value("#{elService.username}") //注入其他Bean属性
  private String realName;
  @Value("classpath:test.txt")  //注入文件资源
  private Resource testFile;

  @Value("${server.port}")  //注入资源文件
  private int serverPort;
}
