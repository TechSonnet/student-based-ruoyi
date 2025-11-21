package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysStudent;

/**
 * 学生基本信息Service接口
 * 
 * @author ruoyi
 * @date 2025-11-17
 */
public interface ISysStudentService 
{
    /**
     * 查询学生基本信息
     * 
     * @param id 学生基本信息主键
     * @return 学生基本信息
     */
    public SysStudent selectSysStudentById(Long id);

    /**
     * 查询学生基本信息列表
     * 
     * @param sysStudent 学生基本信息
     * @return 学生基本信息集合
     */
    public List<SysStudent> selectSysStudentList(SysStudent sysStudent);

    /**
     * 新增学生基本信息
     * 
     * @param sysStudent 学生基本信息
     * @return 结果
     */
    public int insertSysStudent(SysStudent sysStudent);

    /**
     * 修改学生基本信息
     * 
     * @param sysStudent 学生基本信息
     * @return 结果
     */
    public int updateSysStudent(SysStudent sysStudent);

    /**
     * 批量删除学生基本信息
     * 
     * @param ids 需要删除的学生基本信息主键集合
     * @return 结果
     */
    public int deleteSysStudentByIds(Long[] ids);

    /**
     * 删除学生基本信息信息
     * 
     * @param id 学生基本信息主键
     * @return 结果
     */
    public int deleteSysStudentById(Long id);
}
