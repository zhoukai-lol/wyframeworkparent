package com.wangyi.service.impl;

import com.wangyi.dao.TbTeacherMapper;
import com.wangyi.model.TbTeacher;
import com.wangyi.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TbTeacherMapper teacherMapper;

    @Override
    public List<TbTeacher> teacherList(TbTeacher tbTeacher) {
        return teacherMapper.teacherList(tbTeacher);
    }
}
