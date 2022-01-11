package com.minio.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.minio.entity.Person;
import com.minio.mappers.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl {
    @Autowired
    PersonMapper personMapper;


    public void writeFile() {
        List<Person> res = personMapper.selectList(new QueryWrapper<>());
        System.out.println("-------" + res);
    }
}
