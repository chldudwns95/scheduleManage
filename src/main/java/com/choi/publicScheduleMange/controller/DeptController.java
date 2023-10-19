package com.choi.publicScheduleMange.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeptController {

//    @Autowired
//    DeptService deptService;

    @GetMapping("/dept")
    public String deptList() {
        return "dept/deptList";
    }
}
