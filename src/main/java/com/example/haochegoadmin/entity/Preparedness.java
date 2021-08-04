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
public class Preparedness implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String repairItem;

    private Integer repairPrice;

    private String handlerName;

    private Date handleDate;

    private Integer vehicleId;


}
