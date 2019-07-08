package com.wangyi.dao;

import com.wangyi.model.TbTeacher;

import java.util.List;

public interface TbTeacherMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbTeacher record);

    int insertSelective(TbTeacher record);

    TbTeacher selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbTeacher record);

    int updateByPrimaryKeyWithBLOBs(TbTeacher record);

    int updateByPrimaryKey(TbTeacher record);

    /**
     * 讲师列表信息
     * @param tbTeacher
     * @return
     */
    List<TbTeacher> teacherList(TbTeacher tbTeacher);
}