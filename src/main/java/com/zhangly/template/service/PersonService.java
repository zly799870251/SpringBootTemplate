package com.zhangly.template.service;

import com.zhangly.template.mapper.PersonMapper;
import com.zhangly.template.model.Person;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 青葉 on 2017/4/19.
 */
@Service
public class PersonService {

    @Resource
    private PersonMapper personMapper;

    public List<Person> findAll(){
        return personMapper.selectAll();
    }

    public Person findByPrimaryKey(Long id){
        return personMapper.selectByPrimaryKey(id);
    }

    public void save(Person person){
        personMapper.insert(person);
    }

    public void update(Person person){
        personMapper.updateByPrimaryKey(person);
    }

    public void delete(Long id){
        personMapper.deleteByPrimaryKey(id);
    }

}
