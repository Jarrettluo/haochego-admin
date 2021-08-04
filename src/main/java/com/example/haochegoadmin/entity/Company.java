package com.example.haochegoadmin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
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
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String companyName;

    private String abbreviation;

    private Integer validAccount;

    private Date expirationTime;

    /**
     * 创建时间

     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;


}
