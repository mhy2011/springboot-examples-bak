package com.mhy.springboot.dao;

import com.mhy.springboot.model.Person;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author mahaiyuan
 * @ClassName: PersonRepository
 * @date 2017-07-28 下午5:24
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

  List<Person> findByNameLike(String name);

}
