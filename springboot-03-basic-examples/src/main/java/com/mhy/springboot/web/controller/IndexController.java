package com.mhy.springboot.web.controller;

import com.mhy.springboot.component.SiteConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author mahaiyuan
 * @ClassName: IndexController
 * @date 2017-07-20 下午11:26
 */
@Slf4j
@RestController
public class IndexController {

  @Autowired
  private SiteConfig siteConfig;

  @Autowired
  private Environment environment;

  @RequestMapping(value = {"", "/", "/index"})
  public String index() {
    log.debug("siteConfig=" + siteConfig);
    log.debug("active profiles={}", environment.getActiveProfiles()[0]);
    log.debug("profile={}", environment.getProperty("spring.profiles.active"));
    return "Hello" + environment.getProperty("profile");
  }
}
