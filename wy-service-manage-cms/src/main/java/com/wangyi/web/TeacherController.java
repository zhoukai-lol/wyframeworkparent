package com.wangyi.web;


import com.wangyi.api.manager.TeacherControllerApi;
import com.wangyi.model.TbTeacher;
import com.wangyi.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController implements TeacherControllerApi {

    @Autowired
    private TeacherService teacherService;

    @Override
    public List<TbTeacher> teacherList(TbTeacher tbTeacher) {
        return teacherService.teacherList(tbTeacher);
    }
}
