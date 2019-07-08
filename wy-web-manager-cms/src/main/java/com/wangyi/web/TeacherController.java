package com.wangyi.web;

import com.wangyi.model.TbTeacher;
import com.wangyi.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;


    @RequestMapping("/teacherList")

    public List<TbTeacher> teacherList(TbTeacher tbTeacher) {
        return teacherService.teacherList(tbTeacher);
    }
}
