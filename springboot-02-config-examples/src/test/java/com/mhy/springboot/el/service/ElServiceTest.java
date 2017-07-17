package com.mhy.springboot.el.service;

import com.mhy.springboot.el.ElConfig;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author mahaiyuan
 * @ClassName: ElServiceTest
 * @date 2017-07-12 下午11:40
 */
public class ElServiceTest {

  @Test
  public void test01() {
    ApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
    ElService service = context.getBean(ElService.class);

    System.out.println("username:" + service.getUsername());
    System.out.println("osName:" + service.getOsName());
    System.out.println("realName:" + service.getRealName());
    System.out.println("textFile:" + getContent(service.getTestFile()));
    System.out.println("serverPort:" + service.getServerPort());
  }

  public String getContent(Resource resource) {
    StringBuilder bui = new StringBuilder();
    try {
      List<String> lines = FileUtils.readLines(resource.getFile(), "UTF-8");
      int i = 0;
      for (String line : lines) {
        bui.append(line);
        if (i++ < lines.size() - 1) {
          bui.append("\r");
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return bui.toString();
  }

}