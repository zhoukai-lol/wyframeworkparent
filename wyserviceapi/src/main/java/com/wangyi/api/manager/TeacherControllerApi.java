package com.wangyi.api.manager;

import com.wangyi.model.TbTeacher;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public interface TeacherControllerApi {

    @RequestMapping("/teacherList")

    public List<TbTeacher> teacherList(@RequestBody TbTeacher tbTeacher);
}
