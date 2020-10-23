package com.jxj.service;

import com.jxj.entity.emp;
import com.jxj.service.hystrix.empServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "provider",fallback = empServiceHystrix.class)
public interface empService {

    @RequestMapping("findemp")
    public List<emp> findemp();
    @RequestMapping("addemp")
    public void addemp(@RequestBody emp emp);
    @RequestMapping("deleteById")
    public void deleteById(@RequestParam Integer empId);
    @RequestMapping("selectById")
    public emp selectById(@RequestParam Integer empId);
    @RequestMapping("bb")
    String bb();
}
