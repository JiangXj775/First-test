package com.jxj.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class emp implements Serializable {

    private Integer empId;
    private String empName;
    private Integer empDept;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date empDate;
    private String empPost;
    private String empDuty;

    private Integer deptId;
    private String deptName;
}
