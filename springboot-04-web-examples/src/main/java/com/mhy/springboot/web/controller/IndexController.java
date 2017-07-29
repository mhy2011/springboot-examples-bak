package com.mhy.springboot.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mahaiyuan
 * @ClassName: IndexController
 * @date 2017-07-28 下午12:10
 */
@RestController
public class IndexController {
  @RequestMapping(value = {"", "/", "/index"}, method = {RequestMethod.GET, RequestMethod.POST})
  public String index() {
    return "Hello";
  }
}
