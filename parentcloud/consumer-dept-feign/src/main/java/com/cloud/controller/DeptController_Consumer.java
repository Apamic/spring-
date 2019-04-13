package com.cloud.controller;

import com.cloud.entities.Dept;
import com.cloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientService service;

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
        return this.service.list();
    }

    @RequestMapping(value = "/consumer/dept/add")
    public Boolean add(Dept dept) {
        return this.service.add(dept);
    }

    @RequestMapping(value = "/consumer/get/get")
    public Dept One(@RequestParam("id") Long id,@RequestParam("name") String name) {
        return this.service.getOne(id,name);
    }

    @RequestMapping(value = "/consumer/get/get2")
    public Dept Two(@RequestBody Dept dept) {
        return this.service.getTwo(dept);
    }

}
