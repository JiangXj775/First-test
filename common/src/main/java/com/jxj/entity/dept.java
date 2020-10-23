package com.jxj.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class dept implements Serializable {
    private Integer deptId;
    private String deptName;
}
