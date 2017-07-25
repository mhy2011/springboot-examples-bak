package com.mhy.springboot.component;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @author mahaiyuan
 * @ClassName: SiteConfig
 * @date 2017-07-25 下午8:11
 */
@Data
@Component
@ConfigurationProperties(prefix = "siteConfig")
public class SiteConfig {
  private String title;
  private String version;

}
