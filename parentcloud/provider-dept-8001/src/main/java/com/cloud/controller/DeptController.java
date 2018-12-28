package com.cloud.controller;


import com.cloud.entities.Dept;
import com.cloud.service.DeptService;
import com.cloud.service.impl.DeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return service.addDept(dept);
    }

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return service.findByID(id);
    }

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list() {
        return service.findAll();
    }

    @RequestMapping(value = "/hehe",method = RequestMethod.GET)
    public String zxc() {
        return "123456798";
    }
}
