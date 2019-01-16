package com.my.test.springcloud.service;

import com.my.test.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {
    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}
