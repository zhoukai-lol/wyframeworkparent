package com.wangyi.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/toTeacherList")
    public String toTeacherList() {
        return "admin/teacherList";
    }
}
