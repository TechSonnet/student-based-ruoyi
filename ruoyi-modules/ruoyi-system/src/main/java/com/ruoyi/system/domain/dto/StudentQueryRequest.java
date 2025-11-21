package com.ruoyi.system.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ruoyi.common.core.annotation.Excel;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author chang
 * @date 2025/11/21
 * @project student-based-ruoyi
 */
@Data
public class StudentQueryRequest implements Serializable {

    private static final long serialVersionUID = 1L;


    /** 学号（唯一） */
    @Excel(name = "学号", readConverterExp = "唯=一")
    private String studentNo;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 性别（0男 1女 2未知） */
    @Excel(name = "性别", readConverterExp = "0=男,1=女,2=未知")
    private String gender;

    /** 出生日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;
    /** 开始日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startBirthday;
    /** 结束日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endBirthday;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String idCard;

    /** 手机号 */
    @Excel(name = "手机号")
    private String phone;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String email;

    /** 班级ID */
    @Excel(name = "班级ID")
    private Long classId;

    /** 班级名称（冗余） */
    @Excel(name = "班级名称", readConverterExp = "冗=余")
    private String className;

    /** 状态（0正常 1禁用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=禁用")
    private String status;


    /** 搜索值 */
    @JsonIgnore
    private String searchValue;

}
