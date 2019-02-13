package com.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


@SuppressWarnings("serial")
@AllArgsConstructor
@Data
//@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {

    private Long deptno;
    private String dname;
    private String dbSource;             //来自那个数据库，微服务一个服务对应一个数据库，同意信息被储存到不同数据库


}
