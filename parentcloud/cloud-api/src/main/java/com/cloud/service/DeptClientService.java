package com.cloud.service;

import com.cloud.entities.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 *  修改 api工程，根据已经有的DeptClientService接口新建一个实现了
 *  FallbackFactory接口的类DeptClientServiceFallbackFactory
 */
//@FeignClient(value = "provider-dept")
@FeignClient(value = "provider-dept",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list();

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(Dept dept);

    @RequestMapping(value = "/get/get", method = RequestMethod.GET)
    public Dept getOne(@RequestParam("id") long id,@RequestParam("name") String name);

    @RequestMapping(value = "get/get2",method = RequestMethod.POST)
    public Dept getTwo(@RequestBody Dept dept);

}
