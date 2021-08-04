package com.example.haochegoadmin.entity;

import java.util.Date;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Jarrett
 * @since 2021-08-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OperationLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String userCode;

    private String ip;

    private String type;

    private String description;

    private String model;

    private Date operationTime;

    private String result;

    private String params;

    private Integer companyId;


}
