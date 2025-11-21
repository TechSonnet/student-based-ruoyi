package com.ruoyi.system.service.impl;

import java.util.Collections;
import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import com.ruoyi.system.domain.dto.StudentQueryRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysStudentMapper;
import com.ruoyi.system.domain.SysStudent;
import com.ruoyi.system.service.ISysStudentService;

/**
 * 学生基本信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-11-17
 */
@Service
public class SysStudentServiceImpl implements ISysStudentService 
{
    @Autowired
    private SysStudentMapper sysStudentMapper;

    /**
     * 查询学生基本信息
     * 
     * @param id 学生基本信息主键
     * @return 学生基本信息
     */
    @Override
    public SysStudent selectSysStudentById(Long id)
    {
        return sysStudentMapper.selectSysStudentById(id);
    }

    /**
     * 查询学生基本信息列表
     * 
     * @param sysStudent 学生基本信息
     * @return 学生基本信息
     */
    @Override
    public List<SysStudent> selectSysStudentList(SysStudent sysStudent)
    {
        return sysStudentMapper.selectSysStudentList(sysStudent);
    }

//    @Override
//    public List<SysStudent> selectSysStudentList(StudentQueryRequest sysStudent) {
//        return sysStudentMapper.selectSysStudentListByDTO(sysStudent);
//    }

    /**
     * 新增学生基本信息
     * 
     * @param sysStudent 学生基本信息
     * @return 结果
     */
    @Override
    public int insertSysStudent(SysStudent sysStudent)
    {
        sysStudent.setCreateTime(DateUtils.getNowDate());
        return sysStudentMapper.insertSysStudent(sysStudent);
    }

    /**
     * 修改学生基本信息
     * 
     * @param sysStudent 学生基本信息
     * @return 结果
     */
    @Override
    public int updateSysStudent(SysStudent sysStudent)
    {
        sysStudent.setUpdateTime(DateUtils.getNowDate());
        return sysStudentMapper.updateSysStudent(sysStudent);
    }

    /**
     * 批量删除学生基本信息
     * 
     * @param ids 需要删除的学生基本信息主键
     * @return 结果
     */
    @Override
    public int deleteSysStudentByIds(Long[] ids)
    {
        return sysStudentMapper.deleteSysStudentByIds(ids);
    }

    /**
     * 删除学生基本信息信息
     * 
     * @param id 学生基本信息主键
     * @return 结果
     */
    @Override
    public int deleteSysStudentById(Long id)
    {
        return sysStudentMapper.deleteSysStudentById(id);
    }

    /**
     * 查询学生列表，通过DTO
     * @param sysStudent
     * @return
     */
    @Override
    public List<SysStudent> selectSysStudentListByDTO(StudentQueryRequest sysStudent) {
        return Collections.emptyList();
    }
}
