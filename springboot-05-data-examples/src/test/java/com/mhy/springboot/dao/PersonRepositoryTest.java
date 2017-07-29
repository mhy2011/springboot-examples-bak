package com.mhy.springboot.dao;

import com.mhy.springboot.Application;
import com.mhy.springboot.model.Person;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author mahaiyuan
 * @ClassName: PersonRepositoryTest
 * @date 2017-07-28 下午5:47
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class PersonRepositoryTest {

  @Autowired
  PersonRepository repository;

  @Test
  public void testSave() {
    Person person = new Person();
    person.setBirthday(new Date());
    person.setName("张三");
    person.setCreateTime(new Date());
    person = repository.save(person);
    System.out.println(person);
  }

  @Test
  public void testSave2() {
    List<Person> personList = new ArrayList<Person>(10);
    for (int i = 0; i < 10; i++) {
      Person p = new Person();
      p.setBirthday(new Date());
      p.setName("person_" + i);
      p.setCreateTime(new Date());
      personList.add(p);
    }

    personList = repository.save(personList);
    System.out.println(personList);
  }

  @Test
  @Transactional
  public void testGetOne() {
    Person p = repository.getOne(5L);
    System.out.println(p);
  }

}