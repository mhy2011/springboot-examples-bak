package com.mhy.springboot.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mahaiyuan
 * @ClassName: IndexController
 * @date 2017-07-20 下午11:26
 */
@RestController
public class IndexController {

  @RequestMapping(value = {"", "/", "/index"})
  public String index() {
    return "Hello";
  }
}
