package com.mhy.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author mahaiyuan
 * @ClassName: Person
 * @date 2017-07-28 下午5:25
 */
@Data
@Entity
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class Person implements Serializable {
  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private Date birthday;
  private Date createTime;
}
