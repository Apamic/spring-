package com.cloud.service;

import com.cloud.entities.Dept;
import feign.hystrix.FallbackFactory;

import org.springframework.stereotype.Component;

import java.util.List;

@Component //不要忘记加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {

            public Dept get(long id) {
                return new Dept(id,"该ID:"+ id + "没有对应的信息,Consumer客户端提供的降级信息,此刻服务provider以关闭","no this database in MySql");
            }

            public List<Dept> list() {
                return null;
            }

            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
