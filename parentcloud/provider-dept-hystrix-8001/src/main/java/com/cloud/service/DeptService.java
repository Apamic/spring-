package com.cloud.service;



import com.cloud.entities.Dept;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public interface DeptService {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();

    public Dept getOne(long id,String name);

    public Dept getTwo(Dept dept);

//    public Dept getThree(Map<String, Object> map);

}
