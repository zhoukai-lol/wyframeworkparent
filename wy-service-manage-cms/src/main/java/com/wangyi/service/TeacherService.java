package com.wangyi.service;

import com.wangyi.model.TbTeacher;

import java.util.List;

public interface TeacherService {

    /**
     * 讲师列表信息
     * @param tbTeacher
     * @return
     */
    public List<TbTeacher> teacherList(TbTeacher tbTeacher);
}
