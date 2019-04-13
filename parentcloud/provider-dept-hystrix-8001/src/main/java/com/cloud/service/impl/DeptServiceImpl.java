package com.cloud.service.impl;

import com.cloud.dao.DeptDao;
import com.cloud.entities.Dept;
import com.cloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    public Dept findById(Long id) {
        return deptDao.findById(id);
    }

    public List<Dept> findAll() {
        return deptDao.findAll();
    }

    public Dept getOne(long id,String name) {
        return new Dept(id,"该ID:"+ id + "feign接受多个参数" + "该name:" + name + "是我自己加上去的","没有连接数据库");
    }

    public Dept getTwo(Dept dept) {
        return new Dept(dept.getDeptno(),"该ID:"+ dept.getDeptno() + "feign接受body" + "该name:" + dept.getDname() + "是我自己加上去的","没有连接数据库");
    }

//    public Dept getThree(Map<String, Object> map) {
//
//    }
}
