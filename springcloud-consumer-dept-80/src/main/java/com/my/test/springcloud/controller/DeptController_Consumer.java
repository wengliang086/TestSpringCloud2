package com.my.test.springcloud.controller;

import com.my.test.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RequestMapping("consumer")
@RestController
public class DeptController_Consumer {

    public static final String URL_PREFIX = "http://localhost:8001/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/dept/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(URL_PREFIX + "dept/add", dept, Boolean.class);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable String id) {
        return restTemplate.getForObject(URL_PREFIX + "dept/get/" + id, Dept.class);
    }

    @GetMapping("/dept/list")
    public List<Dept> get() {
        return restTemplate.getForObject(URL_PREFIX + "dept/list", List.class);
    }
}
