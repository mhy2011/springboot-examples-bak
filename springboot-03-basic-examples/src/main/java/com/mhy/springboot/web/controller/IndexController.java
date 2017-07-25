package com.mhy.springboot.web.controller;

import com.mhy.springboot.component.SiteConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mahaiyuan
 * @ClassName: IndexController
 * @date 2017-07-20 下午11:26
 */

@RestController
public class IndexController {

  @Autowired
  private SiteConfig siteConfig;

  @RequestMapping(value = {"", "/", "/index"})
  public String index() {
    System.out.println("siteConfig=" + siteConfig);
    return "Hello";
  }
}
