package com.mhy.springboot.el.service;

import com.mhy.springboot.el.ElConfig;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author mahaiyuan
 * @ClassName: PrePostServiceTest
 * @date 2017-07-17 下午11:17
 */
public class PrePostServiceTest {

  @Test
  public void test01() throws Exception {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
    PrePostService service = context.getBean(PrePostService.class);
    service.sayHello("张三");
    service.syaHi("李四");
    context.close();
  }
}