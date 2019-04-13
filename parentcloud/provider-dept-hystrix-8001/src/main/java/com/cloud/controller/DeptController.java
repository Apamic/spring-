package com.cloud.controller;


import com.cloud.entities.Dept;
import com.cloud.service.DeptService;
import com.cloud.service.impl.DeptServiceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")//一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand中fallbackMethod指定的方法
    public Dept get(@PathVariable("id") Long id) {

        Dept dept = this.service.findById(id);
        if (dept.getDeptno() == null) {
            throw new RuntimeException("该ID:"+id+"没有对应的信息");
        }
        return dept;
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id){
        return new Dept(id,"该ID:"+ id + "没有对应的信息，null--@HystrixCommand","no this database in sql");
    }

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list() {
        System.out.println(service.findAll());
        return service.findAll();
    }

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public Boolean add(Dept dept) {
        System.out.println(service.addDept(dept));
        return service.addDept(dept);
    }

    @RequestMapping(value = "get/get",method = RequestMethod.GET)
    public Dept getOne(@RequestParam("id") Long id,@RequestParam("name") String name) {
        System.out.println(id + name);
        return this.service.getOne(id,name);
    }

    @RequestMapping(value = "get/get2",method = RequestMethod.POST)
    public Dept getTwo(@RequestBody Dept dept) {
        return this.service.getTwo(dept);
    }

//    @RequestMapping(value = "get/get3",method = RequestMethod.POST)
//    public Dept getTwo(@RequestBody Dept dept) {
//        return this.service.getTwo(dept);
//    }

}
