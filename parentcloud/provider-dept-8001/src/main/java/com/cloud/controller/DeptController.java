package com.cloud.controller;


import com.cloud.entities.Dept;
import com.cloud.service.DeptService;
import com.cloud.service.impl.DeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return service.addDept(dept);
    }

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list() {
        System.out.println(service.findAll());
        return service.findAll();
    }

    @RequestMapping(value = "/hehe",method = RequestMethod.GET)
    public String zxc() {
        return "123456798";
    }




    @RequestMapping(value = "/dept/discovery",method = RequestMethod.GET)
    public Object discovery() {
        List<String> list = client.getServices();
        System.out.println("*************" + list );
        List<ServiceInstance> serviceInstanceList = client.getInstances("PROVIDER-DEPT");
        for (ServiceInstance serviceInstance : serviceInstanceList ) {
            System.out.println(serviceInstance.getServiceId() + "\t" + serviceInstance.getHost() + "\t"
                    + serviceInstance.getPort() + "\t" + serviceInstance.getUri());
        }
        return this.client;
        }
    }
