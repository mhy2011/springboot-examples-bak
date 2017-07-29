package com.mhy.springboot.web.controller;

import com.mhy.springboot.dao.PersonRepository;
import com.mhy.springboot.model.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @author mahaiyuan
 * @ClassName: PersonController
 * @date 2017-07-28 下午10:51
 */
@RestController
@RequestMapping("/person")
public class PersonController {

  @Autowired
  PersonRepository personRepository;

  @RequestMapping("/get")
  public Person get(Long id) {
    Person p = personRepository.getOne(id);
//    Person p = new Person();
//    p.setId(id);
//    p.setName("张三");
//    p.setBirthday(new Date());
//    p.setCreateTime(new Date());

    return p;
  }

  @RequestMapping("/findAll")
  public List<Person> findAll() {
    List<Person> persons = personRepository.findAll();
    return persons;
  }

  @RequestMapping("/findAll/{column}/{sort}")
  public List<Person> findAllWithSort(@PathVariable("column") String column, @PathVariable("sort") String sort) {
    Sort.Direction direction = Sort.Direction.DESC;
    if ("ASC".equalsIgnoreCase(sort)) {
      direction = Sort.Direction.ASC;
    }
    Sort s = new Sort(direction, column);
    List<Person> persons = personRepository.findAll(s);
    return persons;
  }


  @RequestMapping("/findByName")
  public List<Person> findByName(String name) {
    List<Person> persons = personRepository.findByNameLike(name);
    return persons;
  }

  @RequestMapping("/findByPage")
  public Page<Person> findByPage(int page, int size) {
    PageRequest request = new PageRequest(page, size);
    Page<Person> personPage = personRepository.findAll(request);
    return personPage;
  }
}
